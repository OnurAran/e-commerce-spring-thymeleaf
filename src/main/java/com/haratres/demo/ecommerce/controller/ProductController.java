package com.haratres.demo.ecommerce.controller;

import com.haratres.demo.ecommerce.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public String products(Model theModel, @PathVariable Long id) {
        theModel.addAttribute("product", productService.findProductById(id));
        return "Product";
    }


}
