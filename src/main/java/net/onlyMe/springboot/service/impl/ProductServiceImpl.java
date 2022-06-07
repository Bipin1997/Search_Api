package net.onlyMe.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.onlyMe.springboot.entity.Product;
import net.onlyMe.springboot.repository.ProductRepository;
import net.onlyMe.springboot.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
   
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> searchProducts(String query) {
		
		List<Product> products = productRepository.searchProducts(query);
		return products;
	}
	
	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

}
