package com.catabase.dto;

import com.catabase.entity.Cat;

public class CatDTO {
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public static Cat prepareCatEntity(CatDTO catDTO) {
		Cat cat = new Cat();
		cat.setId(catDTO.getId());
		cat.setImage(cat.getImage());
		cat.setName(catDTO.getName());
		return cat;
	}

}
