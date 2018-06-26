package com.carloser7.covertrafi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carloser7.covertrafi.model.Route;
import com.carloser7.covertrafi.service.RouteService;

@Controller
@RequestMapping("/routes")
public class RouteController {

	@Autowired
	private RouteService routeService;
	
	@Cacheable(value="routes")
	@GetMapping
	public ResponseEntity<List<Route>> buscar() {
		List<Route> routes = this.routeService.bucarTodos();
		return ResponseEntity.ok(routes);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Route> name(@PathVariable Long id) {
		Route route = this.routeService.buscaPor(id);
		System.out.println("Chamano Controller");
		return ResponseEntity.ok(route);
	}
	
	
	
}
