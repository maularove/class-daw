package com.bookstore.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.main.domain.model.Book;
import com.bookstore.main.domain.service.BookService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(BookController.URL)
@RequiredArgsConstructor
public class BookController {

    public static final String URL = "/books";
    private final BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{isbn}")
    public Book findByIsbn(@PathVariable String isbn) {
        return bookService.findByIsbn(isbn);
    }
}
