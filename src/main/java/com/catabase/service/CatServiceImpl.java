package com.catabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catabase.entity.Cat;
import com.catabase.repository.CatRepository;

@Service("catService")
public class CatServiceImpl implements CatService{
	
	@Autowired
	private CatRepository catRepository;

	@Override
	public void findAll() {
		List<Cat> cats = catRepository.findAll();
		cats.stream().forEach(System.out::println);
	}

}
