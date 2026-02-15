package com.example.lms.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // <-- auto-increment
    private long id;
    @NotNull
    private String name ;
    @NotNull
    private String author ;
}
