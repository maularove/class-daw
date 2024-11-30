package fpmislata.bookstore.d_persistence.zdao.interfaces;

import java.util.Optional;

import fpmislata.bookstore.c_domain._2service.model.Book;

public interface BookDao extends GenericDao<Book> {

    Integer count();

    Optional<Book> findByIsbn(String isbn);
}
