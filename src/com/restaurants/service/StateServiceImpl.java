package com.restaurants.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurants.domain.StateList;
import com.restaurants.repository.StateListRepository;

@Service
public class StateServiceImpl implements StateService {
	@Resource
	StateListRepository repository;

	@Override
	@Transactional
	public List<StateList> findAll() {
		return repository.findAll();
	}

}
