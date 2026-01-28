package com.example.lms.Service;

import com.example.lms.Entity.Book;
import com.example.lms.Entity.User;
import com.example.lms.Repository.BookRepository;
import com.example.lms.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository ;

    @Autowired
    private BookRepository bookRepository ;

    public void saveNewUser(User user){
        userRepository.save(user) ;
    }

    public void updateUsername(String username, String newName){
        User cur = userRepository.findByUsername(username) ;
        cur.setUsername(newName) ;
    }

    public void updatePassword(String username, String newPassword){
        User cur = userRepository.findByUsername(username) ;
        cur.setPassword(newPassword);
    }

    public void deleteUser(String username){
        User cur = userRepository.findByUsername(username) ;
        userRepository.delete(cur);
    }

    public List<Book> allBooks(){
        return bookRepository.findAll() ;
    }


}
