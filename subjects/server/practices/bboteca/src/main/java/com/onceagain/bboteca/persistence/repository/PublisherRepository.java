package com.onceagain.bboteca.persistence.repository;

import java.util.List;

import com.onceagain.bboteca.domain.model.Publisher;

public interface PublisherRepository {

    List<Publisher> getAll();
}
