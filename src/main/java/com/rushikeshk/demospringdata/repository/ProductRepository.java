package com.rushikeshk.demospringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushikeshk.demospringdata.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
