package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;
import com.devsuperior.dsdeliver.entities.Product;

public class ProductDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long Id;
	private String Name;
	private Double Price;
	private String Description;
	private String ImageUri;
	
	public ProductDTO() {}

	public ProductDTO(long id, String name, Double price, String description, String imageUri) {
		Id = id;
		Name = name;
		Price = price;
		Description = description;
		ImageUri = imageUri;
	}
	
	public ProductDTO(Product entity) {
		Id = entity.getId();
		Name = entity.getName();
		Price = entity.getPrice();
		Description = entity.getDescription();
		ImageUri = entity.getImageUri();
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getImageUri() {
		return ImageUri;
	}

	public void setImageUri(String imageUri) {
		ImageUri = imageUri;
	}
	
	
}
