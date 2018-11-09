package cn.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

	@RequestMapping("testHello/{name}")
	public String testHello(@PathVariable String name){
		return "user1："+name;
	}
}
