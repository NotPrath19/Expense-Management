package com.product_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product_management.model.Image;

public interface ImageRepository extends JpaRepository<Image, String>{

}
