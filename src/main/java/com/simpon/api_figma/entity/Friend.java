package com.simpon.api_figma.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "friends")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @ManyToMany(mappedBy = "friends")
    private List<User> users;

    // getters and setters
}