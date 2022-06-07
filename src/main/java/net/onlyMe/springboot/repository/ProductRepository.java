package net.onlyMe.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.onlyMe.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	 @Query("SELECT p FROM Product p WHERE " +
	            "p.name LIKE CONCAT('%',:query, '%')" +
	            "Or p.description LIKE CONCAT('%', :query, '%')")
	List<Product> searchProducts(String query);
}
