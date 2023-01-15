package com.simpon.api_figma.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter @Getter @Builder @AllArgsConstructor @NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_user_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "user_group_id"))
    private List<UserGroup> userGroups;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Chat> chats;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_friend",
            joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "friend_id"))
    private List<Friend> friends;

    @Enumerated(EnumType.ORDINAL)
    private Statut statut;

    @OneToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;


    // getters and setters
}
