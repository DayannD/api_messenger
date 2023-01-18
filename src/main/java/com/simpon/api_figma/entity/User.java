package com.simpon.api_figma.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter @Builder @AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

/*    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_user_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "user_group_id"))
    private List<UserGroup> userGroups;*/

    @ManyToMany(mappedBy = "participants", cascade = CascadeType.ALL)
    private List<Chat> chats;

/*
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_friend",
            joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "friend_id"))
    private List<Friend> friends = new ArrayList<>();
*/

/*
    @Enumerated(EnumType.ORDINAL)
    private Statut statut;
*/

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Message> messages;
/*
    @OneToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;
*/

    public User(){
        this.chats = new ArrayList<>();
        this.messages = new ArrayList<>();
    }
    // getters and setters
}
