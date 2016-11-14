package com.restaurants.service;

import java.util.List;

import com.restaurants.domain.User;

public interface UserService {
	
	public void save(User user);

	public void delete(User user);

	public List<User> findAll();

}
