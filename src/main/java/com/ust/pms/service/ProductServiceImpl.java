package com.ust.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.pms.model.Product;
import com.ust.pms.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public String saveProduct(Product product) {

		int productPrice = product.getPrice();
		int productQuantity = product.getQuantityOnHand();
		if (productPrice > 0 && productQuantity > 0) {
			int gst = 12;
			int newPrice = product.getPrice() + product.getPrice() / 100 * gst;
			product.setPrice(newPrice);
			productRepository.save(product);
			return "Product Saved Successfully";
		} else {
			return "Product not Saved Successfully";
		}

	}

	@Override
	public String updateProduct(Product product) {

		int productPrice = product.getPrice();
		if (productPrice > 0) {
			productRepository.save(product);
			return "Product Updated Successfully";
		} else {
			return "Product not Updated Successfully";
		}

	}

	@Override
	public String deleteProduct(int productId) {
		System.out.println("Delete Service");
		// TODO Auto-generated method stub
		productRepository.deleteById(productId);
		return "Product Deleted Successfully";

	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		Optional<Product> productData = productRepository.findById(productId);
		Product product = productData.get();
		return product;
	}

	@Override
	public boolean isProductExists(int productId) {

		return productRepository.existsById(productId);
	}

	@Override
	public List<Product> getProductByName(String productName) {
		// TODO Auto-generated method stub
		return productRepository.findByProductName(productName);
	}

}
