package com.haratres.demo.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Currency;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "url")
    private String url;
    @Column(name = "description", columnDefinition="LONGTEXT")
    private String description;
    @Column(name = "priceAmount")
    private BigDecimal priceAmount;
    @Column(name = "priceCurrency")
    private Currency priceCurrency;
    @Column(name = "discountRate")
    private BigDecimal discountRate;


}
