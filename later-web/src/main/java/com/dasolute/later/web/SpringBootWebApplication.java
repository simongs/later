package com.dasolute.later.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

/**
 * Created by simons on 2017. 4. 20..
 */
@SpringBootApplication(scanBasePackages = "com.dasolute.later")
public class SpringBootWebApplication extends SpringBootServletInitializer {

    public static void main(String args[]) {
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "local");
        ConfigurableApplicationContext ca = SpringApplication.run(SpringBootWebApplication.class, args);
        Arrays.stream(ca.getBeanDefinitionNames()).forEach(System.out::println);
    }

    /**
     * 외부 톰캣에서 war 파일을 띄우기 위해 필요한 Class 및 Override 해야할 method
     * SpringBootServletInitializer
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplication.class);
    }
}