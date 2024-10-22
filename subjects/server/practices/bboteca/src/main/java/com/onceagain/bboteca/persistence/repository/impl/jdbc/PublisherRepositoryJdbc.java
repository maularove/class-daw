package com.onceagain.bboteca.persistence.repository.impl.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.onceagain.bboteca.domain.model.Publisher;
import com.onceagain.bboteca.persistence.repository.PublisherRepository;
import com.onceagain.bboteca.persistence.repository.impl.jdbc.mapper.PublisherRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PublisherRepositoryJdbc implements PublisherRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Publisher> getAll() {
        String sql = """
                        SELECT * FROM publishers
                """;
        return jdbcTemplate.query(sql, new PublisherRowMapper());
    }
}
