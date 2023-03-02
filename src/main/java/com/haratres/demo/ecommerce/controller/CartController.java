package com.haratres.demo.ecommerce.controller;

import com.haratres.demo.ecommerce.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/my_cart/{userid}")
    public String getAllProductInMyCart(@PathVariable Long userId, Model theModel){

        theModel.addAttribute("product", cartService.getAllProductInMyCart(userId));
        return "Cart";
    }

    @GetMapping("/my_cart/add/{id}")
    public String addProductToCart(@PathVariable Long id) {
        cartService.setProductToCartById(id);
        return "Cart";
    }


}
