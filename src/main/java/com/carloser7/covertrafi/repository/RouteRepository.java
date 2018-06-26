package com.carloser7.covertrafi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.carloser7.covertrafi.model.Route;

public interface RouteRepository extends JpaRepository<Route, Long>{

	@Query("select r from routes r order by r.route_short_name asc")
	public List<Route> findAllShortName();
	
}
