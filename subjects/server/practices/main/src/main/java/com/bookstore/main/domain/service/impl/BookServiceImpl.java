package com.bookstore.main.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookstore.main.domain.model.Book;
import com.bookstore.main.domain.service.BookService;
import com.bookstore.main.persistence.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn)
                .orElseThrow(() -> new BookNotFoundException("Book not found with ISBN: " + isbn));
    }
}
