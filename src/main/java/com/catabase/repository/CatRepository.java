package com.catabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catabase.entity.Cat;

public interface CatRepository extends JpaRepository<Cat, Long>{
	
}
