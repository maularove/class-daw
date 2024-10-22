package com.onceagain.bboteca.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onceagain.bboteca.domain.exception.ResourceNotFoundException;
import com.onceagain.bboteca.domain.model.Author;
import com.onceagain.bboteca.domain.service.AuthorService;
import com.onceagain.bboteca.persistence.repository.AuthorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> getAll() {
        return authorRepository.getAll();
    }

    @Override
    public Author findByAuthorId(Integer id) {
        return authorRepository.findByAuthorId(id)
                .orElseThrow(() -> new ResourceNotFoundException("Author id " + id + " not found"));
    }
}
