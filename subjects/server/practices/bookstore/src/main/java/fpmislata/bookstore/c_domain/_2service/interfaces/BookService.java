package fpmislata.bookstore.c_domain._2service.interfaces;

import java.util.List;
import java.util.Optional;

import fpmislata.bookstore.c_domain._2service.model.Book;

public interface BookService {

    List<Book> getAll(Integer page, Integer size);

    Integer count();

    Optional<Book> fidnByIsbn(String isbn);

    Optional<Long> create(Book book);

    Optional<Long> update(Book book);
}
