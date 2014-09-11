package com.schedule.junit.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class JUnitTestTask {
	@Scheduled(fixedRate=5000)
	public void doSomething() {
	    // something that should execute periodically
	}
}
