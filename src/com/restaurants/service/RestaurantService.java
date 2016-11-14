package com.restaurants.service;

import java.util.List;

import com.restaurants.domain.Restaurant;

public interface RestaurantService {

	public void save(Restaurant restaurant);

	public void delete(Restaurant restaurant);

	public List<Restaurant> findAll();
	
	public Restaurant find(String restName);

}
