package com.onceagain.bboteca.controller.webModel.author;

public record AuthorDetail(
        Integer id,
        String name,
        String nationality,
        String biography,
        Integer birthYear,
        Integer deathYear) {
}
