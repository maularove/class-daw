package com.bookstore.main.persistence.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.main.domain.model.Genre;
import com.bookstore.main.persistence.GenreRepository;
import com.bookstore.main.persistence.impl.mapper.GenreRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class GenreRepositoryJdbc implements GenreRepository {

    private final JdbcTemplate jdbcComplate;

    @Override
    public List<Genre> getByIsbnBook(String isbn) {
        String sql = """
                SELECT genres.* FROM genres
                JOIN books_genres ON genres.id = books_genres.genre_id
                JOIN books ON books_genres.book_id = books.id
                AND books.isbn = ?
                """;
        return jdbcComplate.query(sql, new GenreRowMapper(), isbn);
    }
}
