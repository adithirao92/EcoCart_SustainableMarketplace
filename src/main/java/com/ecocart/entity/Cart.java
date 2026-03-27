package com.ecocart.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Links to Aashika A's Customer class
    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    // One cart can have many items inside it
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items;

    private Double totalPrice;
}