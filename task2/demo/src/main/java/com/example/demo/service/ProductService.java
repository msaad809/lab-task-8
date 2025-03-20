package com.example.demo.service;



import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product cloneProduct(Long productId, String newColor) {
        Optional<Product> existingProduct = productRepository.findById(productId);

        if (existingProduct.isPresent()) {
            Product clonedProduct = existingProduct.get().clone();
            clonedProduct.setId(null);  // Ensure new entry in DB
            clonedProduct.setColor(newColor);
            return productRepository.save(clonedProduct);
        } else {
            throw new RuntimeException("Product not found with ID: " + productId);
        }
    }
}

