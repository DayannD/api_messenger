package com.simpon.api_figma.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Setter @Getter @Builder @AllArgsConstructor @NoArgsConstructor
@Table(name = "user_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "profile_name")
    private String profileName;

    @Column(name = "email_id", nullable = false)
    private String emailId;

    @Column(name = "status")
    private String status;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "age")
    private Integer age;

    @OneToOne(mappedBy = "userProfile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private User user;

// getters and setters
}