package cn.tedu.inter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider-user")
@RequestMapping("/user/")
public interface ClientInterface {

	@RequestMapping("testHello/{name}")
	public String testHello(@PathVariable("name")String name);
}
