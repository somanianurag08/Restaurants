package com.restaurants.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurants.domain.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Serializable> {

	public Restaurant findByRestaurantName(String restaurantName);
}
