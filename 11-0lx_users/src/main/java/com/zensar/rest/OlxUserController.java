package com.zensar.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.OlxUser;
import com.zensar.service.OlxUserService;

@RestController
public class OlxUserController {
	@Autowired
	OlxUserService service;
	
	@PostMapping(value="/user")
	public OlxUser f1(@RequestBody OlxUser olxUser) {
		return this.service.addOlxUser(olxUser);
		
	}
	@GetMapping(value="/user/{userId}")
	public OlxUser f2(@PathVariable(name="userId")int id){
		return this.service.findUserById(id);
	}
	
	@GetMapping(value="/getUserByUserName/{userName}")
	public OlxUser f3(@PathVariable(name="userName")String userName) {
		return  this.service.findByUserName(userName);
		
	}

}
