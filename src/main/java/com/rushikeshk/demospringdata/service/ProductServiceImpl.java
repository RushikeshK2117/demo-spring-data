package com.rushikeshk.demospringdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rushikeshk.demospringdata.model.Product;
import com.rushikeshk.demospringdata.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> listAll() {
		return productRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product updateProductInfo(Product product) {
		return productRepository.save(product);
	}
	

}
