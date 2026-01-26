package com.example.lms.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    private long id;
    private String username ;
    private String password ;
    private String role ;                                    //either user or admin

}
