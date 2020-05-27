package kr.co.goott.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	// 똑같은 주소로 GET방식 POST 방식으로 나누어 받을수있다.
	@RequestMapping(value = "/member/login.do", method = RequestMethod.GET)
	public String loginProcess1() {
		return "login/login";
	}
	
//	@GetMapping
//	@PostMapping
	
	
}
