package com.devsenior.students.eamolinam.bookservice.service;

import java.util.List;

import com.devsenior.students.eamolinam.bookservice.model.Book;

public interface BookService {
    List<Book> findAll();

    Book findbyId(String id);

    Book createBook(Book info);

    Book updateBook(String id, Book info);

    void deleteBook(String id);

    void markRead(String id);
} 