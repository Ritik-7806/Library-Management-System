package com.example.lms.Controller;

import com.example.lms.Repository.UserRepository;
import com.example.lms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired private UserRepository userRepository ;
    @Autowired private UserService userService ;

    public void updateUsername(@RequestBody String username, @RequestBody String newName){
        userService.updateUsername(username,newName); ;
    }

}
