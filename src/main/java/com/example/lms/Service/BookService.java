package com.example.lms.Service;

import com.example.lms.Entity.Book;
import com.example.lms.Entity.User;
import com.example.lms.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository ;

    public void update(String name, Book book){
        Book bk = bookRepository.findByName(name) ;
        bk.setName(book.getName());
        bk.setAuthor(book.getAuthor());
        bookRepository.save(book) ;
    }

    public List<Book> allBooks(){
        return bookRepository.findAll() ;
    }

}
