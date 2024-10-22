package com.bookstore.main.domain.service;

import java.util.List;

import com.bookstore.main.domain.model.Book;

public interface BookService {

    List<Book> getAll();

    Book findByIsbn(String isbn);
}
