package com.catabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Cat {
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
