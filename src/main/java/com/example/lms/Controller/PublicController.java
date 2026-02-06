package com.example.lms.Controller;

import com.example.lms.DTO.LoginRequest;
import com.example.lms.Entity.User;
import com.example.lms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PublicController {

    @Autowired private UserService userService ;

    @PostMapping("signup")
    public ResponseEntity<String> signUp(@RequestBody User user){
        userService.saveNewUser(user) ;
        return ResponseEntity.status(HttpStatus.CREATED).body("User Registered Successfully") ;
    }

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest){
        userService.login(loginRequest) ;
        return ResponseEntity.status(HttpStatus.CREATED).body("User login Successfully") ;
    }

    @GetMapping("logout")
    public ResponseEntity<String> logOut(){
        return ResponseEntity.status(HttpStatus.OK).body("Logout Successfully") ;
    }
}
