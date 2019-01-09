package com.bah.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bah.poc.model.Product;
import com.bah.poc.repository.ProductRepository;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody String addProduct(@RequestBody Product product) {
		productRepository.save(product);
		return "Saved";
	}

	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody Iterable<Product> getAllProducts() {
		// This returns a JSON or XML with the users
		return productRepository.findAll();
	}
}
