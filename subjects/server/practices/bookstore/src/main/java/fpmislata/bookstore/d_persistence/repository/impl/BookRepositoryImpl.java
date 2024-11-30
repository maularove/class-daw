package fpmislata.bookstore.d_persistence.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import fpmislata.bookstore.c_domain._2service.model.Author;
import fpmislata.bookstore.c_domain._2service.model.Book;
import fpmislata.bookstore.d_persistence.repository.interfaces.BookRepository;
import fpmislata.bookstore.d_persistence.zdao.interfaces.AuthorDao;
import fpmislata.bookstore.d_persistence.zdao.interfaces.BookDao;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {

    private final BookDao bookDao;
    private final AuthorDao authorDao;

    @Override
    public List<Book> getAll(Integer page, Integer size) {
        return bookDao.getAll(page, size);
    }

    @Override
    public Integer count() {
        return bookDao.count();
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return bookDao.findByIsbn(isbn);
    }

    @Override
    public Optional<Long> save(Book book) {
        List<Author> authorList = book.getAuthors();
        authorList.forEach(author -> {
            authorDao.save(author);
        });
        return bookDao.save(book);
    }
}
