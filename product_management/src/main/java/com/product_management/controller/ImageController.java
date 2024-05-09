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

import com.product_management.model.Image;
import com.product_management.model.Product;
import com.product_management.repository.ImageRepository;
import com.product_management.repository.ProductRespositoy;

@RestController
@RequestMapping("/images")
@CrossOrigin(origins = "http://localhost:3003")
public class ImageController {
	@Autowired
	ImageRepository imageRepository;

	@PostMapping("/save")
	public Image getMethodName(@RequestBody Image image) {
		return imageRepository.saveAndFlush(image);
	}

	@GetMapping("/get")
	public List<Image> getAllImages() {
		return imageRepository.findAll();
	}
	

}
