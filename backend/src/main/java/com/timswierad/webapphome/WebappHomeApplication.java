package com.timswierad.webapphome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.context.annotation.*;


@ComponentScan(basePackages = "com.timswierad.webapphome")
@SpringBootApplication
public class WebappHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappHomeApplication.class, args);

	}


}
