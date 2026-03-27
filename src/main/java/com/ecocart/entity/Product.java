package com.ecocart.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;

    // Links to the Vendor (Aashika A's code)
    @ManyToOne
    @JoinColumn(name = "vendor_id", nullable = false)
    private Vendor vendor;

    // Links to your Category
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}