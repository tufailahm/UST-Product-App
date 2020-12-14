package com.ust.pms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ust.pms.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

	public List<Product> findByProductName(String productName);  
	public List<Product> findByPrice(int price);		// select * from product where price = 1000;
	public List<Product> findByPriceGreaterThan(int price);		// select * from product where price = 1200;
	//public User findByUsernameAndPassword(String username,String password);  // selec  
}
