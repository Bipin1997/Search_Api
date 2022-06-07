package net.onlyMe.springboot.service;

import java.util.List;

import net.onlyMe.springboot.entity.Product;

public interface ProductService  {

	List<Product> searchProducts(String query);

	Product createProduct(Product product);
}
