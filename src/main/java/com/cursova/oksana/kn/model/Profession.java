package com.cursova.oksana.kn.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "profession")
@Entity
public class Profession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "rating", nullable = false)
    private int rating;

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "recommendation", nullable = false)
    private String recommendation;

}