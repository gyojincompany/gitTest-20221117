package com.gyojincompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2Controller {
	
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		return "안녕하세요 반갑습니다!";
	}
	
}
