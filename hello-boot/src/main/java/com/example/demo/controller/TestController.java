package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TestDTO;


// @RestController : jsp나 html 같은 별도의 view 없이 문자열 데이터를 보낼 수 있음

@RestController
public class TestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello Boot world";
	}
	
	
	@GetMapping("/iombok")
	public String lombokShow() {
		TestDTO dto  = new TestDTO();
//		dto.setId("hong");
//		dto.setPwd("1234");
//		dto.setEmail("hong@gmail.com");
//		
		return null;
		
		// lombok은 이런식으로 쓴다 자동으로 setter,getter가 생김
	}
	
}
