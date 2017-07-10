package com.timswierad.webapphome.repository;

import com.timswierad.webapphome.model.SkillCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResumeSkillRepo extends MongoRepository<SkillCategory, String> {

}