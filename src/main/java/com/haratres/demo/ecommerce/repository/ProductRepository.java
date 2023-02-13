package com.haratres.demo.ecommerce.repository;

import com.haratres.demo.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

//    @Query(value = "SELECT title FROM product",nativeQuery = true)
//    List<Product> findAllProduct();
    @Query(value = "SELECT * FROM product WHERE id=?1",nativeQuery = true)
    Product findProductById(Long id);


    Product findByUrl(String url);
}
