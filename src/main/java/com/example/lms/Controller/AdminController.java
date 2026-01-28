package com.example.lms.Controller;

import com.example.lms.Entity.Book;
import com.example.lms.Entity.User;
import com.example.lms.Repository.BookRepository;
import com.example.lms.Repository.UserRepository;
import com.example.lms.Service.BookService;
import com.example.lms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    BookRepository bookRepository ;
    @Autowired
    BookService bookService ;
    @Autowired
    UserRepository userRepository ;
    @Autowired
    UserService userService ;

    public void introduce(@RequestBody Book book){
        bookRepository.save(book) ;
    }

    public void updateBook(@RequestBody String name, @RequestBody Book book){
        bookService.update(name,book) ;
    }

    public void deleteBook(@RequestBody long id){
        bookRepository.deleteById(id);
    }

    public void deleteUser(@RequestBody long id){
        userRepository.deleteById(id);
    }

    public List<Book> viewAllBooks(){
        return bookService.allBooks() ;
    }

    public List<User> allUsers(){
        return userService.allUsers() ;
    }

}
