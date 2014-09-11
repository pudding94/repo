package com.schedule.junit.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.schedule.junit.service.JunitTestService", serviceName = "junitTestService")
public class JunitTestServiceImpl implements JunitTestService {

	@Override
	public String execute(String script) {
		// TODO Auto-generated method stub
		return "result=="+script;
	}

}
