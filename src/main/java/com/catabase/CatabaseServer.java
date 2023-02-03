package com.catabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.catabase.service.CatService;

@SpringBootApplication
public class CatabaseServer implements CommandLineRunner{
	
	@Autowired
	private CatService catService;

	public static void main(String[] args) {
		SpringApplication.run(CatabaseServer.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
