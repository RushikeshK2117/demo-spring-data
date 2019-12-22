package com.rushikeshk.demospringdata.service;

import java.util.List;

import com.rushikeshk.demospringdata.model.Product;

public interface ProductService {

	Product save(Product product);
	
	List<Product> listAll();

	void delete(Long id);

	Product updateProductInfo(Product product);
	
	

}
