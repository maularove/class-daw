package com.onceagain.bboteca.persistence.repository.impl.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.onceagain.bboteca.domain.model.Category;

public class CategoryRowMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        Category category = new Category();
        category.setId(rs.getInt("categories.id"));
        category.setName(rs.getString("categories.name_es"));
        category.setSlug(rs.getString("categories.slug"));
        return category;
    }
}
