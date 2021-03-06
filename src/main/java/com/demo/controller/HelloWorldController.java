package com.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Ege
 */

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}



}
