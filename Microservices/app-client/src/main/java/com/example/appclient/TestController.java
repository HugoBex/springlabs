package com.example.appclient;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/one")
@RefreshScope
public class TestController {

	@Value("${msg}")
	private String msg;
	
	@RequestMapping(value="/get", method = RequestMethod.GET)	
	public String getMsg() {
		return "APP 1 " + msg + " " + LocalTime.now();
	}
}
