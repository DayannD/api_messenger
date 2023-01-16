package com.simpon.api_figma.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter @Builder @AllArgsConstructor @NoArgsConstructor
@Table(name = "chats")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "chat_user",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> users = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "user_group_id")
    private UserGroup userGroup;

    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Message> messages;

    // getters and setters
}