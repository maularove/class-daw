package com.onceagain.bboteca.controller.webModel.publisher;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.onceagain.bboteca.domain.model.Publisher;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    PublisherCollection toPublisherCollection(Publisher publisher);

    PublisherDetail toPublisherDetail(Publisher publisher);
}
