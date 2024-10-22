package com.onceagain.bboteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onceagain.bboteca.controller.webModel.author.AuthorCollection;
import com.onceagain.bboteca.controller.webModel.author.AuthorDetail;
import com.onceagain.bboteca.controller.webModel.author.AuthorMapper;
import com.onceagain.bboteca.domain.service.AuthorService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(AuthorController.URL)
@RequiredArgsConstructor
public class AuthorController {

    public static final String URL = "/api/authors";

    private final AuthorService authorService;

    @GetMapping
    public ResponseEntity<List<AuthorCollection>> getAll() {
        List<AuthorCollection> authorCollections = authorService
                .getAll()
                .stream()
                .map(AuthorMapper.INSTANCE::toAuthorCollection)
                .toList();
        return new ResponseEntity<>(authorCollections, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDetail> findByIsbn(@PathVariable Integer id) {
        AuthorDetail authorDetail = AuthorMapper.INSTANCE.toAuthorDetail(authorService.findByAuthorId(id));
        return new ResponseEntity<>(authorDetail, HttpStatus.OK);
    }
}
