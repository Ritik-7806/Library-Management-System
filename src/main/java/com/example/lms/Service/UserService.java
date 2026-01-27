package com.example.lms.Service;

import com.example.lms.Entity.User;
import com.example.lms.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository ;

    public void saveNewUser(User user){
        userRepository.save(user) ;
    }

    public void updateUsername(String username, String newName){
        User cur = userRepository.findByUsername(username) ;
        cur.setUsername(newName) ;
    }


}
