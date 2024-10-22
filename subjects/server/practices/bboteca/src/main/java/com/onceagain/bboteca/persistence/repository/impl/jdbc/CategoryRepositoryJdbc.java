package com.onceagain.bboteca.persistence.repository.impl.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.onceagain.bboteca.domain.model.Category;
import com.onceagain.bboteca.persistence.repository.CategoryRepository;
import com.onceagain.bboteca.persistence.repository.impl.jdbc.mapper.CategoryRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CategoryRepositoryJdbc implements CategoryRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Category> getAll() {
        String sql = """
                        SELECT * FROM categories
                """;
        return jdbcTemplate.query(sql, new CategoryRowMapper());
    }
}
