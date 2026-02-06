package com.example.lms.Service;

import com.example.lms.DTO.LoginRequest;
import com.example.lms.DTO.UpdateUser;
import com.example.lms.Entity.Book;
import com.example.lms.Entity.User;
import com.example.lms.Repository.BookRepository;
import com.example.lms.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository ;

    @Autowired
    private BookRepository bookRepository ;

    @Autowired
    private PasswordEncoder passwordEncoder ;

    public void saveNewUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user) ;
    }

    public void updateUser(UpdateUser cur){
        User user = userRepository.findByUsername(cur.getUsername()) ;
        if(user == null) throw new RuntimeException("user not found") ;
        if(!passwordEncoder.matches(cur.getPassword(), user.getPassword()))throw new RuntimeException("invalid password") ;

        /// user verified successfully
        user.setUsername(cur.getNewUsername());
        user.setPassword(passwordEncoder.encode(cur.getNewPassword()));
    }

    public void login(LoginRequest cur){
        User user = userRepository.findByUsername(cur.getUsername()) ;
        if(user == null) throw new RuntimeException("user not found") ;
        if(!passwordEncoder.matches(cur.getPassword(), user.getPassword()))throw new RuntimeException("invalid password") ;

        /// user verified successfully
        return ;
    }


    public void deleteUser(String username){
        User cur = userRepository.findByUsername(username) ;
        userRepository.delete(cur);
    }

    public List<User> allUsers(){
        return userRepository.findAll() ;
    }


}
