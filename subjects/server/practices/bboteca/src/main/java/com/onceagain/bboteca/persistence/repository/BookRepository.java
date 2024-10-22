package com.onceagain.bboteca.persistence.repository;

import java.util.List;
import java.util.Optional;

import com.onceagain.bboteca.domain.model.Book;

public interface BookRepository {

    List<Book> getAll();

    Optional<Book> findByIsbn(String isbn);
}
