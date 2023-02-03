package com.catabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Cat {
	
	/* 
	 * This series will update the value of the id in the database by 1
	 * for every new entry updated.
	 * 
	 * This relies on the application.properties configuration of
	 * spring.jpa.hibernate.ddl-auto=create (or create-drop, or update)
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceSubCategoryId")
	@SequenceGenerator(name = "SequenceSubCategoryId", sequenceName = "SUB_CATEGORY_SEQ")
	private long id;
	private String name;
	private String image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
