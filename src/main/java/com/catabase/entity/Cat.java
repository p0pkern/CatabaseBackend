package com.catabase.entity;

import java.util.Objects;

import com.catabase.dto.CatDTO;

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
	private String breed;
	private String location;
	private String type;
	private String bodyType;
	private String coatType;
	private String coatPattern;
	private String imageLocation;
	
	public Cat() {}

	public Cat(long id, String breed, String location, String type, String bodyType, String coatType,
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
		Cat other = (Cat) obj;
		return Objects.equals(breed, other.breed) && id == other.id;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", breed=" + breed + ", location=" + location + ", type=" + type + ", bodyType="
				+ bodyType + ", coatType=" + coatType + ", coatPattern=" + coatPattern + ", imageLocation="
				+ imageLocation + "]";
	}

	public static CatDTO getCatDTO(Cat cat) {
		CatDTO catDTO = new CatDTO();
		catDTO.setId(cat.getId());
		catDTO.setBreed(cat.getBreed());
		catDTO.setBodyType(cat.getBodyType());
		catDTO.setCoatPattern(cat.getCoatPattern());
		catDTO.setCoatType(cat.getCoatType());
		catDTO.setLocation(cat.getLocation());
		catDTO.setType(cat.getLocation());
		catDTO.setImageLocation(cat.getImageLocation());
		
		return catDTO;
	}
	
}
