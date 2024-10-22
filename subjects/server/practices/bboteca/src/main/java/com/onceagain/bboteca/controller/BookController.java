package com.onceagain.bboteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onceagain.bboteca.controller.webModel.book.BookCollection;
import com.onceagain.bboteca.controller.webModel.book.BookDetail;
import com.onceagain.bboteca.controller.webModel.book.BookMapper;
import com.onceagain.bboteca.domain.service.BookService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(BookController.URL)
@RequiredArgsConstructor
public class BookController {

    public static final String URL = "/api/books";

    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookCollection>> getAll() {
        List<BookCollection> bookCollections = bookService
                .getAll()
                .stream()
                .map(BookMapper.INSTANCE::toBookCollection)
                .toList();
        return new ResponseEntity<>(bookCollections, HttpStatus.OK);
    }

    @GetMapping("/{isbn}")
    public ResponseEntity<BookDetail> findByIsbn(@PathVariable String isbn) {
        BookDetail bookDetail = BookMapper.INSTANCE.toBookDetail(bookService.findByIsbn(isbn));
        return new ResponseEntity<>(bookDetail, HttpStatus.OK);
    }
}
