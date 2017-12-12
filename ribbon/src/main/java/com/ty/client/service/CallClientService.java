package com.ty.client.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value="SERVICE-HI")
/*@FeignClient(value="SERVICE-HI")   value为调用的服务名 即application.properties/yml配置里spring.application.name=xxx的配置
接口方法上面@RequestMapping(value="/hi")为service-hi服务的controller/action访问地址*/
public interface CallClientService {

	@RequestMapping(value="/hi")
	public String getClientString();
}
