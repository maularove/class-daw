package com.onceagain.bboteca.persistence.repository;

import java.util.List;

import com.onceagain.bboteca.domain.model.Genre;

public interface GenreRepository {

    List<Genre> getByIsbnBook(String isbn);
}
