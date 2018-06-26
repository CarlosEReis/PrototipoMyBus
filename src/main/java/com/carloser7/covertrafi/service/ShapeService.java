package com.carloser7.covertrafi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloser7.covertrafi.model.Shape;
import com.carloser7.covertrafi.repository.ShapeRepository;

@Service
public class ShapeService {

	@Autowired
	private ShapeRepository repository;
	
	public List<Shape> buscarPor(String id) {
//		String novoId = id.concat("_ida");
//		System.out.println(novoId);
		return this.repository.buscarTodos(id);
	}
	
}
