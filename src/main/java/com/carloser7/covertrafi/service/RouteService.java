package com.carloser7.covertrafi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloser7.covertrafi.model.Route;
import com.carloser7.covertrafi.repository.RouteRepository;

@Service
public class RouteService {

	@Autowired
	private RouteRepository repository;
	
	public Route buscaPor(Long id) {
		return this.repository.findById(id).get();
	}

	public List<Route> bucarTodos() {
		return this.repository.findAllShortName();
	}
	
}
