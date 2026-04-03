package com.devsenior.students.eamolinam.bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.students.eamolinam.bookservice.model.Book;
import com.devsenior.students.eamolinam.bookservice.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController { // CONTROLADOR  o Servicio RESTful (porque tienen todos)
     
    //@Autowired      //Lo utiliza springboot para insertar en la variable un objeto que tengo en algun lugar de la memoria o sea un bean(ya no el "new")
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService =bookService;
    }

    @GetMapping
    public List<Book> getAll(){
        return bookService.findAll();
    }

    @GetMapping("/{isbn}")
    public Book getByIsbn(@PathVariable String isbn){
        return bookService.findbyId(isbn);
    }

    @PostMapping
    public Book newBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @PutMapping("/{isbn}")
    public Book updateBook(@PathVariable String isbn, @RequestBody Book book){
        return bookService.updateBook(isbn, book);
    }

    @DeleteMapping("/{isbn}")
    public void deleteBook(@PathVariable String isbn){
        bookService.deleteBook(isbn);
    }
}
