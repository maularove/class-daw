package com.onceagain.bboteca.domain.service;

import java.util.List;

import com.onceagain.bboteca.domain.model.Author;

public interface AuthorService {

    List<Author> getAll();

    Author findByAuthorId(Integer id);
}
