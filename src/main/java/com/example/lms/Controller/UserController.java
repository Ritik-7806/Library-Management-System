package com.example.lms.Controller;

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

    @PutMapping("updateUsername")
    public ResponseEntity<String> updateUsername(@RequestParam String username, @RequestParam String newName){
        userService.updateUsername(username,newName);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Username updated successfully") ;
    }

    @PostMapping("updatePassword")
    public ResponseEntity<String> updatePassword(@RequestBody String username, @RequestBody String newPassword){
        userService.updatePassword(username,newPassword);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Password updated successfully") ;
    }

    @DeleteMapping("deleteMe")
    public ResponseEntity<String> deleteUser(@RequestBody String username){
        userService.deleteUser(username) ;
        return ResponseEntity.ok("you have been deleted successfully") ;
    }

    public ResponseEntity<List<Book>>  viewAllBooks(){
        return ResponseEntity.ok(bookService.allBooks()) ;
    }

}
