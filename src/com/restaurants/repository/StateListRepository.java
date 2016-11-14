package com.restaurants.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurants.domain.StateList;

@Repository
public interface StateListRepository extends JpaRepository<StateList, Serializable> {
}
