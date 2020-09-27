package com.dasolute.later.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootWebApplication {

    public static void main(String args[]) {
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "local");
        ConfigurableApplicationContext ca = SpringApplication.run(SpringBootWebApplication.class, args);
        Arrays.stream(ca.getBeanDefinitionNames()).forEach(System.out::println);
    }

}