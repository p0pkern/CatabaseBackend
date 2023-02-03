package com.catabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catabase.entity.Cat;
import com.catabase.service.CatService;

@RestController
public class CatController {
	
	@Autowired
	private CatService catService;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "If-Match")
	@GetMapping("/all")
	List<Cat> all() {
		return catService.findAll();
	}
}
