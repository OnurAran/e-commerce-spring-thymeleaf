package com.haratres.demo.ecommerce.service.imp;

import com.haratres.demo.ecommerce.entity.Product;
import com.haratres.demo.ecommerce.repository.ProductRepository;
import com.haratres.demo.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }


    @Override
    public Product findProductById(Long id) {
        return productRepository.findProductById(id);
    }
}
