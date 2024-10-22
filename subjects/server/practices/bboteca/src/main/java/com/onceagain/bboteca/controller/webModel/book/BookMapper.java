package com.onceagain.bboteca.controller.webModel.book;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.onceagain.bboteca.controller.webModel.author.AuthorMapper;
import com.onceagain.bboteca.controller.webModel.genre.GenreMapper;
import com.onceagain.bboteca.controller.webModel.publisher.PublisherMapper;
import com.onceagain.bboteca.domain.model.Book;

@Mapper(uses = { PublisherMapper.class, AuthorMapper.class, GenreMapper.class })
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookCollection toBookCollection(Book book);

    @Mapping(target = "publisherCollection", source = "publisher")
    @Mapping(target = "authorsCollection", source = "authors")
    @Mapping(target = "category", source = "category.name")
    @Mapping(target = "genres", source = "genres")
    BookDetail toBookDetail(Book book);
}
