package com.devsenior.students.eamolinam.bookservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.devsenior.students.eamolinam.bookservice.model.Book;

@Service
public class MemoryBookService implements BookService{

    private List<Book> books = new ArrayList<>();


    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public Book findbyId(String id) {
        return books.stream().filter(book -> book.getIsbn().equals(id))
        .findFirst()
        .orElse(null);
    }

    @Override
    public Book createBook(Book info) {
        books.add(info);
        return info;
    }

    @Override
    public Book updateBook(String id, Book info) {
        var book = findbyId(id);
        if(book != null){
            book.setIsbn(info.getIsbn());
            book.setAuthor(info.getAuthor());
            book.setTitle(info.getTitle());
        }
        return book;
    }

    @Override
    public void deleteBook(String id) {
        var book = findbyId(id);
        books.remove(book);
    }

    @Override
    public void markRead(String id) {
        findbyId(id).setLeido(true);
    }
    
}
