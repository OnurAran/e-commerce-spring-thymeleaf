package com.haratres.demo.ecommerce.service;

import com.haratres.demo.ecommerce.entity.Cart;
import com.haratres.demo.ecommerce.entity.Product;

import java.util.List;

public interface CartService {
    Cart setProductToCartById(Long id);

    List<Product> getAllProductInMyCart(Long userId);
}
