package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.tedu.inter.ClientInterface;

@RestController
@RequestMapping("/client/")
public class HystrixController {
	@Autowired
	private ClientInterface clientInterface;
	
	@RequestMapping("testClient/{name}")
	@HystrixCommand(fallbackMethod="clientFallback")
	public String testClient(@PathVariable String name){
		return clientInterface.testHello(name);
	}
	
	public String clientFallback(String name){
		return "华";
	}
}
