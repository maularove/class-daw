package com.onceagain.bboteca.controller.webModel.genre;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.onceagain.bboteca.domain.model.Genre;

@Mapper
public interface GenreMapper {

    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);

    List<String> toGenreNameList(List<Genre> genres);

    default String toGenreName(Genre genre) {
        return genre.getName();
    }
}
