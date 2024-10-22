package com.bookstore.main.domain.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private Integer id;
    private String name;
    private String nationality;
    private String biography;
    private int birthYear;
    private int deathYear;
}
