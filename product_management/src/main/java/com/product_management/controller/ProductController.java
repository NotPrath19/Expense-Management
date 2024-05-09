package com.product_management.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product_management.model.Product;
import com.product_management.repository.ProductRespositoy;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:3003")
public class ProductController {
	@Autowired
	ProductRespositoy productRespositoy;

	@PostMapping("/save")
	public Product getMethodName(@RequestBody Product product) {
		return productRespositoy.saveAndFlush(product);
	}

	@GetMapping("/get")
	public List<Product> getAllProduct() {
		List<Product> products = productRespositoy.findAll().stream().map(product -> {
			if (product.getDate().isAfter(LocalDate.now())) {
				product.setStatus("Valid");
			} else {
				product.setStatus("Expired");
			}
			return product;
		}).collect(Collectors.toList());
		return products;
	}
	

}
