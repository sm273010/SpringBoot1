package com.example.demo.webservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebService {
	@RequestMapping("/hello")
	public String helloworld() {
		return "Hello world!!";
	}
}
