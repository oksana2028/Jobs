package com.cursova.oksana.kn.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "surname", nullable = false, length = 45)
    private String surname;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @Column(name = "encrypted_password", nullable = false, length = 45)
    private String encryptedPassword;

    @Column(name = "creared_at", nullable = false)
    private LocalDate crearedAt;

    @Column(name = "role", nullable = false)
    private  String role;
}