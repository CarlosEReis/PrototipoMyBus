package com.carloser7.covertrafi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.carloser7.covertrafi.model.Shape;

public interface ShapeRepository extends JpaRepository<Shape, String> {

	@Query("SELECT s FROM shapes s WHERE s.shape_id = :id")
	List<Shape> buscarTodos(@Param("id") String id);
	
}
