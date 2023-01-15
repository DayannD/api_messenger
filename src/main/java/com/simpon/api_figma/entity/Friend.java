package com.simpon.api_figma.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter @Getter @Builder @AllArgsConstructor @NoArgsConstructor
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