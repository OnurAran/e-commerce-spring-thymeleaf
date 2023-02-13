package com.haratres.demo.ecommerce.service;

import com.haratres.demo.ecommerce.entity.Product;
import com.haratres.demo.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findProduct(){
        return productRepository.findAll();
    }


}
