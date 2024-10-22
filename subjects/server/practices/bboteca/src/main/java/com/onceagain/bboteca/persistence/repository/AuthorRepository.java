package com.onceagain.bboteca.persistence.repository;

import java.util.List;
import java.util.Optional;

import com.onceagain.bboteca.domain.model.Author;

public interface AuthorRepository {

    List<Author> getAll();

    Optional<Author> findByAuthorId(Integer id);

    List<Author> getByIsbnBook(String isbn);
}
