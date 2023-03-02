package com.haratres.demo.ecommerce.service.imp;

import com.haratres.demo.ecommerce.entity.Cart;
import com.haratres.demo.ecommerce.entity.Product;
import com.haratres.demo.ecommerce.repository.CartRepository;
import com.haratres.demo.ecommerce.repository.ProductRepository;
import com.haratres.demo.ecommerce.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private CartRepository cartRepository;
    private ProductRepository productRepository;

    public CartServiceImpl(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Cart setProductToCartById(Long id) {
        Cart cart = new Cart();
//        return cartRepository.insertProductToCartById(productRepository.findProductById(id));
        Product product = productRepository.findById(id).orElse(null);
        cart.setId(product.getId());
        cart.setOrderTotal(product.getDiscountRate());
        return cartRepository.save(cart);
    }

    @Override
    public List<Product> getAllProductInMyCart(Long userId) {
        return cartRepository.getAllProductInMyCart(userId);
    }
}
