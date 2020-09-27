package com.dasolute.later.web.business.entry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class EntryPageController {

	@GetMapping("/welcome")
	public String hello(Map model){
		model.put("message", "hello freemarker!");
		return "hello";
	}
}
