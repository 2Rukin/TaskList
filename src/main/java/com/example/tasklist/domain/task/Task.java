package com.example.tasklist.domain.task;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Data
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Enumerated(value = EnumType.STRING)
    private Status status;

    private LocalDateTime expirationDate;

    @Column(name = "image")
    @CollectionTable(name = "tasks_images")
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> images;

}
