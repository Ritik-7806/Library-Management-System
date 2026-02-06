package com.example.lms.Controller;

import com.example.lms.DTO.UpdateUser;
import com.example.lms.Entity.Book;
import com.example.lms.Repository.UserRepository;
import com.example.lms.Service.BookService;
import com.example.lms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired private UserRepository userRepository ;
    @Autowired private UserService userService ;
    @Autowired private BookService bookService ;
    //@Autowired private UpdateUser updateUser ;


    @PostMapping("update-user")
    public ResponseEntity<String> updateUser(@RequestBody UpdateUser updateUser){
        userService.updateUser(updateUser) ;
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("User updated successfully") ;
    }

    @DeleteMapping("delete-me")
    public ResponseEntity<String> deleteUser(@RequestBody String username){
        userService.deleteUser(username) ;
        return ResponseEntity.ok("you have been deleted successfully") ;
    }

    @GetMapping("view-all-books")
    public ResponseEntity<List<Book>>  viewAllBooks(){
        return ResponseEntity.ok(bookService.allBooks()) ;
    }

}
