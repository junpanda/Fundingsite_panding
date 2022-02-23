package com.junpanda.panding.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	// 로그인 화면
	@GetMapping("/user/signin")
	public String signin() {
		return "user/signin";
	}
	
	// 회원가입 화면
	@GetMapping("/user/signup")
	public String signup() {
		return "user/signup";
	}
}
