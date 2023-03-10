package com.haratres.demo.ecommerce.repository;

import com.haratres.demo.ecommerce.entity.Cart;
import com.haratres.demo.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {

    @Query(value = "INSERT INTO Cart VALUES (product)",nativeQuery = true)
    Cart insertProductToCartById(Product product);

    @Query(value = "SELECT * FROM Cart WHERE userId=?1",nativeQuery = true)
    List<Product> getAllProductInMyCart(Long userId);
}
