package com.junpanda.panding.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HelloRequest {
	@RequestMapping("/test")
	public String ex() {
		return "/test/test";
	}
	
}
