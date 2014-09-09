package com.conversation.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conversation.po.User;
import com.conversation.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping()
	public  String redirectToUser(){
		  System.out.println("redirect to user.jsp");
	      return "page/user.jsp";//forward
//		  return "redirect:http://www.baidu.com"; 
	}
	@RequestMapping(value="/addUser") 
	@ResponseBody
	public int addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	@RequestMapping(value="/getUser") 
	@ResponseBody  
	public User getUser(int id) {
		User user=this.userService.getUser(id);
		if(user == null)
			return new User();
		return user;
	}
}
