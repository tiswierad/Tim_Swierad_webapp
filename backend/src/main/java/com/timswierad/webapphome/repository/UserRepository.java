package com.timswierad.webapphome.repository;


import com.timswierad.webapphome.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}