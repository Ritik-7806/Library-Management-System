package com.example.lms.Controller;

import com.example.lms.Entity.User;
import com.example.lms.Repository.UserRepository;
import com.example.lms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired private UserRepository userRepository ;
    @Autowired private UserService userService ;

    public void update(@RequestBody String username, @RequestBody User user ){
        userService.updateUser(username,user);
    }

}
