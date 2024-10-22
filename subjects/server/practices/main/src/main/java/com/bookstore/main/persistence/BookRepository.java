package com.bookstore.main.persistence;

import java.util.List;
import java.util.Optional;

import com.bookstore.main.domain.model.Book;

public interface BookRepository {

    List<Book> getAll();

    Optional<Book> findByIsbn(String isbn);
}
