package com.ecocart.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
public class Customer extends User {
    private String address;
}