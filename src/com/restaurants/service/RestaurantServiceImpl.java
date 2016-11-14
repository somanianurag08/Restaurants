package com.restaurants.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurants.domain.Restaurant;
import com.restaurants.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Resource
	RestaurantRepository repository;

	@Override
	@Transactional
	public void save(Restaurant restaurant) {
		repository.save(restaurant);
	}

	@Override
	@Transactional
	public void delete(Restaurant restaurant) {
		repository.delete(restaurant);
	}

	@Override
	@Transactional
	public List<Restaurant> findAll() {
		return (List<Restaurant>) repository.findAll();
	}
	
	@Override
	@Transactional
	public Restaurant find(String restName) {
		return repository.findByRestaurantName(restName);
	}

}
