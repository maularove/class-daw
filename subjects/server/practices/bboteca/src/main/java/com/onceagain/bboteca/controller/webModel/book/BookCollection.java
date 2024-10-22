package com.onceagain.bboteca.controller.webModel.book;

import java.math.BigDecimal;

public record BookCollection(
        String isbn,
        String title,
        BigDecimal price,
        float discount,
        String cover) {
}
