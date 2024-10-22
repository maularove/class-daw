package com.onceagain.bboteca.domain.service;

import java.util.List;

import com.onceagain.bboteca.domain.model.Book;

public interface BookService {

    List<Book> getAll();

    Book findByIsbn(String isbn);
}
