package com.restaurants.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurants.domain.User;
import com.restaurants.service.UserService;

@RestController
@RequestMapping("/UserResController")
public class UserResController {

	@Autowired
	private UserService service;

	@RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		service.save(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@RequestMapping(value="/users", method = RequestMethod.GET, produces = "application/json")
	public List<User> getUsers() {
		return service.findAll();
	}

}
