package com.onceagain.bboteca.persistence.repository.impl.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.onceagain.bboteca.domain.model.Author;
import com.onceagain.bboteca.persistence.repository.AuthorRepository;
import com.onceagain.bboteca.persistence.repository.impl.jdbc.mapper.AuthorRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryJdbc implements AuthorRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Author> getAll() {
        String sql = """
                    SELECT * FROM authors
                """;
        return jdbcTemplate.query(sql, new AuthorRowMapper());
    }

    @Override
    public Optional<Author> findByAuthorId(Integer id) {
        String sql = """
                    SELECT * FROM authors
                     WHERE authors.id = ?
                """;
        try {
            Author author = jdbcTemplate.queryForObject(sql, new AuthorRowMapper(), id);
            return Optional.of(author);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Author> getByIsbnBook(String isbn) {
        String sql = """
                    SELECT authors.* FROM authors
                    JOIN books_authors ON authors.id = books_authors.author_id
                    JOIN books ON books_authors.book_id = books.id
                    AND books.isbn = ?
                """;
        return jdbcTemplate.query(sql, new AuthorRowMapper(), isbn);
    }
}
