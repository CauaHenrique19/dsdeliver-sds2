package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.devsuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	@Query("SELECT DISTINCT obj from Order obj JOIN FETCH obj.Products WHERE obj.Status = 0 ORDER BY obj.Moment ASC")
	List<Order> findOrdersWithProducts();
}
