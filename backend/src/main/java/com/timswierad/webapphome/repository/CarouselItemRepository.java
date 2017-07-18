package com.timswierad.webapphome.repository;

import com.timswierad.webapphome.model.CarouselItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarouselItemRepository extends MongoRepository<CarouselItem, String> {

}