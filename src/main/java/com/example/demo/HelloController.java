package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "<!DOCTYPE html><html><head><title>Hello</title></head><body><p>Hello World</p></body></html>";
	}
  @RequestMapping("*")
  public String notFound() {
    return "<!DOCTYPE html><html><head><title>Error</title></head><body><p>This page doesn't exist.</p></body></html>";
  }
} 
 
 
