package com.onceagain.bboteca.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    private Integer id;
    private String name;
    private String slug;
}
