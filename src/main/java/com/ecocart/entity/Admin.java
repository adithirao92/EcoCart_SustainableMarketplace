package com.ecocart.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "admins")
@Data
@EqualsAndHashCode(callSuper = true)
public class Admin extends User {
    // Admins don't need extra fields for now, 
    // but they need this class to exist for the Role.ADMIN mapping.
}