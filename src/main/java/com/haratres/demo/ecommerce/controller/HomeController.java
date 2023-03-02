package com.haratres.demo.ecommerce.controller;

import com.haratres.demo.ecommerce.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private ProductService productService;

    public HomeController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/home")
    public String Products(Model theModel){
        theModel.addAttribute("product", productService.findAllProduct());
        return "UserHome";
    }

}
