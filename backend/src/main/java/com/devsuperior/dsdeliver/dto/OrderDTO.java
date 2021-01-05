package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;

public class OrderDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private String Address;
	private Double Latitude;
	private Double Longitude;
	private Instant Moment;
	private OrderStatus Status;
	
	private List<ProductDTO> products = new ArrayList<>();
	
	public OrderDTO() {}

	public OrderDTO(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
		Id = id;
		Address = address;
		Latitude = latitude;
		Longitude = longitude;
		Moment = moment;
		Status = status;
	}
	
	public OrderDTO(Order entity) {
		Id = entity.getId();
		Address = entity.getAddress();
		Latitude = entity.getLatitude();
		Longitude = entity.getLongitude();
		Moment = entity.getMoment();
		Status = entity.getStatus();
		products = entity.getProducts()
				.stream()
				.map(product -> new ProductDTO(product))
				.collect(Collectors.toList());
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Double getLatitude() {
		return Latitude;
	}

	public void setLatitude(Double latitude) {
		Latitude = latitude;
	}

	public Double getLongitude() {
		return Longitude;
	}

	public void setLongitude(Double longitude) {
		Longitude = longitude;
	}

	public Instant getMoment() {
		return Moment;
	}

	public void setMoment(Instant moment) {
		Moment = moment;
	}

	public OrderStatus getStatus() {
		return Status;
	}

	public void setStatus(OrderStatus status) {
		Status = status;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}
}
