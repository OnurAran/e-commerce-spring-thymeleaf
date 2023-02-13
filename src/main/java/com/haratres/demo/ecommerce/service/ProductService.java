package com.haratres.demo.ecommerce.service;

import com.haratres.demo.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
    Product findProductById(Long id);
    List<Product> findAllProduct();

}
