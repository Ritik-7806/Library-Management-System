package com.example.lms.Controller;

import com.example.lms.Entity.Book;
import com.example.lms.Repository.UserRepository;
import com.example.lms.Service.BookService;
import com.example.lms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired private UserRepository userRepository ;
    @Autowired private UserService userService ;
    @Autowired private BookService bookService ;

    public void updateUsername(@RequestBody String username, @RequestBody String newName){
        userService.updateUsername(username,newName); ;
    }

    public void updatePassword(@RequestBody String username, @RequestBody String newPassword){
        userService.updatePassword(username,newPassword);
    }

    public void deleteUser(@RequestBody String username){
        userService.deleteUser(username) ;
    }

    public List<Book> viewAllBooks(){
        return bookService.allBooks() ;
    }

}
