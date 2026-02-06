package com.example.lms.Controller;

import com.example.lms.Entity.Book;
import com.example.lms.Entity.User;
import com.example.lms.Repository.BookRepository;
import com.example.lms.Repository.UserRepository;
import com.example.lms.Service.BookService;
import com.example.lms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    BookRepository bookRepository ;
    @Autowired
    BookService bookService ;
    @Autowired
    UserRepository userRepository ;
    @Autowired
    UserService userService ;

    @PostMapping("introduce-book")
    public ResponseEntity<String> introduce(@RequestBody Book book){
        bookRepository.save(book) ;
        return ResponseEntity.ok("New Book has been introduced in the library") ;
    }

    @PostMapping("update-book")
    public ResponseEntity<String> updateBook(@RequestBody String name, @RequestBody Book book){
        bookService.update(name,book) ;
        return ResponseEntity.ok("book has been updated") ;
    }

    @DeleteMapping("delete-book")
    public ResponseEntity<String> deleteBook(@RequestBody long id){
        bookRepository.deleteById(id);
        return ResponseEntity.ok("book is deleted successfully") ;
    }

    @DeleteMapping("delete-user")
    public ResponseEntity<String> deleteUser(@RequestBody long id){
        userRepository.deleteById(id);
        return ResponseEntity.ok("User is deleted successfully") ;
    }

    @GetMapping("all-books")
    public ResponseEntity<List<Book>> viewAllBooks(){
        return ResponseEntity.ok(bookService.allBooks()) ;
    }

    @GetMapping("all-users")
    public ResponseEntity<List<User>> allUsers(){
        return ResponseEntity.ok(userService.allUsers()) ;
    }

}
