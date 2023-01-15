package com.simpon.api_figma.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter @Getter @Builder @AllArgsConstructor @NoArgsConstructor
@Table(name = "user_groups")
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "userGroups")
    private List<User> users;

    @OneToMany(mappedBy = "userGroup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Chat> chats;

    // getters and setters
}