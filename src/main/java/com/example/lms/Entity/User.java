package com.example.lms.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // <-- auto-increment
    private long id;
    private String username ;
    private String password ;
    private String role ;                                    //either user or admin

}
