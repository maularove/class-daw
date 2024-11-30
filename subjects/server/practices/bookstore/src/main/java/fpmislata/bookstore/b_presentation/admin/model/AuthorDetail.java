package fpmislata.bookstore.b_presentation.admin.model;

public record AuthorDetail(
        Long id,
        String name,
        String nationality,
        String biographyEn,
        String biographyEs,
        Integer birthYear,
        Integer deathYear) {
}
