package com.springmicrouser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springmicrouser.VO.ResponseTemplateVO;
import com.springmicrouser.entity.Users;
import com.springmicrouser.service.UserService;

@RestController
@RequestMapping("/users")
@EnableEurekaClient
public class UserController {

	@Autowired
	private UserService userservice;
	
	@PostMapping("/")
	public Users saveUser(@RequestBody Users user){
		return userservice.saveUser(user);
	}

	@GetMapping("/{id}")
	public ResponseTemplateVO getByUserDepartment(@PathVariable("id") Long userId) {
		return userservice.getByUserDepartment(userId);
	}
}