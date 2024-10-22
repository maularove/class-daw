package com.bookstore.main.persistence;

import java.util.List;

import com.bookstore.main.domain.model.Author;

public interface AuthorRepository {

    List<Author> getByIsbnBook(String isbn);
}
