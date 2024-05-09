package com.product_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product_management.model.Product;
@Repository
public interface ProductRespositoy extends JpaRepository<Product, String> {

}
