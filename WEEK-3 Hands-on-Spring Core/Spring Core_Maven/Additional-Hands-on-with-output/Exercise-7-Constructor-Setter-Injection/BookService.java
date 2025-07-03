package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String configValue;

    public BookService(String configValue) {
        this.configValue = configValue;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("Config Value: " + configValue);
        bookRepository.save(bookName);
    }
}