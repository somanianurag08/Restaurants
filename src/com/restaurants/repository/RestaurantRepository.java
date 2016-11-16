package com.restaurants.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.restaurants.domain.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Serializable> {

	public Restaurant findByRestaurantName(String restaurantName);
	
	//@Query("SELECT  r ,( 6371 * acos( cos( radians(:latitude) ) * cos( radians( r.latitude ) ) * cos( radians( r.longitude ) - radians(:longitude) ) + sin( radians(:latitude) ) * sin( radians( r.latitude ) ) ) ) AS distance FROM restaurant r where distance < 1 ORDER BY distance")
	@Query("SELECT  r FROM Restaurant r where ( 6371 * acos( cos( radians(:latitude) ) * cos( radians( r.latitude ) ) * cos( radians( r.longitude ) - radians(:longitude) ) + sin( radians(:latitude) ) * sin( radians( r.latitude ) ) ) ) < 1 ")
     public List<Restaurant> findNearestRestaurant(@Param("latitude") String latitude , @Param("longitude") String longitude);

}
