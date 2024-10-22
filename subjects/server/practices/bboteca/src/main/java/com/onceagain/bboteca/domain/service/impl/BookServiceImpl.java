package com.onceagain.bboteca.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onceagain.bboteca.domain.exception.ResourceNotFoundException;
import com.onceagain.bboteca.domain.model.Book;
import com.onceagain.bboteca.domain.service.BookService;
import com.onceagain.bboteca.persistence.repository.BookRepository;

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
                .orElseThrow(() -> new ResourceNotFoundException("Book isbn " + isbn + " not found"));
    }
}
