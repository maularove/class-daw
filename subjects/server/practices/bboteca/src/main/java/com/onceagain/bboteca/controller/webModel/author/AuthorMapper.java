package com.onceagain.bboteca.controller.webModel.author;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.onceagain.bboteca.domain.model.Author;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorCollection toAuthorCollection(Author author);

    AuthorDetail toAuthorDetail(Author author);
}
