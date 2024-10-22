package com.bookstore.main.persistence.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.main.domain.model.Author;
import com.bookstore.main.persistence.AuthorRepository;
import com.bookstore.main.persistence.impl.mapper.AuthorRowMapper;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryJdbc implements AuthorRepository {

    private final JdbcTemplate JdbcTemplate;

    @Override
    public List<Author> getByIsbnBook(String isbn) {

        String sql = """
                SELECT authors.* FROM authors
                JOIN books_authors ON authors.id = books_authors.author_id
                JOIN books ON books_authors.book_id = books.id
                AND books.isbn = ?
                """;
        return JdbcTemplate.query(sql, new AuthorRowMapper(), isbn);
    }
}
