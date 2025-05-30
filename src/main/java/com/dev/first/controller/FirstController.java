package com.dev.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

	@GetMapping("/user/{name}")
	@ResponseBody
	public String getName(@PathVariable("name") String name) {
		return "welcome " + name + " to the Devops first project";
	}
}