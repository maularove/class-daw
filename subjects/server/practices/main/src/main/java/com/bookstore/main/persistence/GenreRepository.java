package com.bookstore.main.persistence;

import java.util.List;
import com.bookstore.main.domain.model.Genre;

public interface GenreRepository {

    List<Genre> getByIsbnBook(String isbn);
}
