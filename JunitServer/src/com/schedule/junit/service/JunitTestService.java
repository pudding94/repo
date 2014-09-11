package com.schedule.junit.service;

import javax.jws.WebService;

@WebService
public interface JunitTestService {
	public String execute(String script);
}
