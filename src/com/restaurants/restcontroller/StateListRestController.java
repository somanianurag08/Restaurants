package com.restaurants.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurants.domain.StateList;
import com.restaurants.service.StateService;

@RestController
@RequestMapping("/StateListRestController")
public class StateListRestController {
	
	@Autowired
	private StateService service;

	@RequestMapping(value = "/states", method = RequestMethod.GET, produces = "application/json")
	public List<StateList> getStats() {
		return service.findAll();
	}

}
