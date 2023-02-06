package com.catabase.dto;

import java.util.Objects;

import com.catabase.entity.Cat;

public class CatDTO {
	private long id;
	private String breed;
	private String location;
	private String type;
	private String bodyType;
	private String coatType;
	private String coatPattern;
	private String imageLocation;
	
	public CatDTO() {}

	public CatDTO(long id, String breed, String location, String type, String bodyType, String coatType,
			String coatPattern, String imageLocation) {
		super();
		this.id = id;
		this.breed = breed;
		this.location = location;
		this.type = type;
		this.bodyType = bodyType;
		this.coatType = coatType;
		this.coatPattern = coatPattern;
		this.imageLocation = imageLocation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getCoatType() {
		return coatType;
	}

	public void setCoatType(String coatType) {
		this.coatType = coatType;
	}

	public String getCoatPattern() {
		return coatPattern;
	}

	public void setCoatPattern(String coatPattern) {
		this.coatPattern = coatPattern;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(breed, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatDTO other = (CatDTO) obj;
		return Objects.equals(breed, other.breed) && id == other.id;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", breed=" + breed + ", location=" + location + ", type=" + type + ", bodyType="
				+ bodyType + ", coatType=" + coatType + ", coatPattern=" + coatPattern + ", imageLocation="
				+ imageLocation + "]";
	}

	public static Cat getCatEntity(CatDTO catDTO) {
		Cat cat = new Cat();
		cat.setId(catDTO.getId());
		cat.setBreed(catDTO.getBreed());
		cat.setBodyType(catDTO.getBodyType());
		cat.setCoatPattern(catDTO.getCoatPattern());
		cat.setCoatType(catDTO.getCoatType());
		cat.setLocation(catDTO.getLocation());
		cat.setType(catDTO.getLocation());
		cat.setImageLocation(catDTO.getImageLocation());
		
		return cat;
	}

}
