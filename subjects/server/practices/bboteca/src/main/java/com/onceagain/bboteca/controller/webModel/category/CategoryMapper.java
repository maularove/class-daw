package com.onceagain.bboteca.controller.webModel.category;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.onceagain.bboteca.domain.model.Category;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryCollection toCategoryCollection(Category category);

    CategoryDetail toCategoryDetail(Category category);
}
