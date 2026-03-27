package com.ecocart.service;

import com.ecocart.entity.*;
import org.springframework.stereotype.Service;

@Service
public class UserFactory {
    public User createUser(String role) {
        if (role.equalsIgnoreCase("VENDOR")) {
            return new Vendor();
        }
        return new Customer(); // Default to Customer [cite: 58, 62]
    }
}