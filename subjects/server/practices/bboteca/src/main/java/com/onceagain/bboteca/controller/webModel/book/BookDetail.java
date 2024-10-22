package com.onceagain.bboteca.controller.webModel.book;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onceagain.bboteca.controller.webModel.author.AuthorCollection;
import com.onceagain.bboteca.controller.webModel.publisher.PublisherCollection;

public record BookDetail(
        String isbn,
        String title,
        BigDecimal price,
        float discount,
        String synopsis,
        String cover,
        List<String> genres,
        String category,
        @JsonProperty("publisher") PublisherCollection publisherCollection,
        @JsonProperty("authors") List<AuthorCollection> authorsCollection) {
}
