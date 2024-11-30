package fpmislata.bookstore.b_presentation.admin.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

// lo que devuelve en el find by isbn
public record BookDetail(
                String isbn,
                String title,
                BigDecimal price,
                float discount,
                String synopsis,
                String cover,
                @JsonProperty("publisher") PublisherCollection publisherCollection,
                @JsonProperty("authors") List<AuthorCollection> authorCollections) {
}