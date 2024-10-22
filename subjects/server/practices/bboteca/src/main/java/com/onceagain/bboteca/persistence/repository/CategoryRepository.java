package com.onceagain.bboteca.persistence.repository;

import java.util.List;

import com.onceagain.bboteca.domain.model.Category;

public interface CategoryRepository {

    List<Category> getAll();
}
