package com.carloser7.covertrafi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carloser7.covertrafi.model.Shap;
import com.carloser7.covertrafi.model.Shape;
import com.carloser7.covertrafi.service.ShapeService;

@Controller
@RequestMapping("/shape")
public class ShapeController {

	@Autowired
	private ShapeService shapeService;

	@GetMapping("/{id}")
	public ResponseEntity<List<Shap>> buscaPor(@PathVariable String id) {
		List<Shape> shapes = this.shapeService.buscarPor(id);
		List<Shap> shaps = new ArrayList<>();

		for (Shape atual : shapes) {
			Shap shap = new Shap();
			shap.setLat(atual.getShape_pt_lat());
			shap.setLng(atual.getShape_pt_lon());
			shaps.add(shap);
		}

		return ResponseEntity.ok(shaps);
	}

}
