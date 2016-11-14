package com.restaurants.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurants.domain.Restaurant;
import com.restaurants.service.RestaurantService;

@RestController
@RequestMapping("/RestaurantResController")
public class RestaurantResController {

	@Autowired
	private RestaurantService service;

	@RequestMapping(value = "/restaurants", method = RequestMethod.GET, produces = "application/json")
	public List<Restaurant> getRestaurants() {
		return service.findAll();
	}

	@RequestMapping(value = "/createrestaurant", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Restaurant> createRestaurant(
			@RequestBody Restaurant restaurant) {
		service.save(restaurant);
		return new ResponseEntity<Restaurant>(restaurant, HttpStatus.OK);
	}

	@RequestMapping(value = "/getrestaurant/{restName}", method = RequestMethod.GET, produces = "application/json")
	public Restaurant getRestaurants(@PathVariable String restName) {
		return service.find(restName);
	}

}
