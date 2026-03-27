package com.ecocart.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
public class Vendor extends User {
    private String storeName; 
}