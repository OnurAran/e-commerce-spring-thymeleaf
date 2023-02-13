package com.haratres.demo.ecommerce.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "surname")
    private String surname;

    @Column(length = 10, nullable = false, name = "number")
    private Integer phoneNumber;

    @Column(nullable = false, name = "email")
    private String email;

    @Pattern(regexp="^[a-zA-Z0-9]{8}",message="Şifre 8 karakterden uzun olmalıdır.")
    @Column(nullable = false, name = "password")
    private String password;

    @Column(name = "date")
    private Date date;

    @Column(name = "gender")
    private String gender;

    @Column(name = "adress" )//long text
    private String adress;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Cart cart;

    @OneToOne
    private Role role;

}
