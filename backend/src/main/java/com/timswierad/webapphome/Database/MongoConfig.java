package com.timswierad.webapphome.Database;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
  
    @Override
    protected String getDatabaseName() {
        return "timswieradhome";
    }
  
    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("192.168.7.11", 27017);
    }
  
    @Override
    protected String getMappingBasePackage() {
        return "come.timswierad.webapphome";
    }
}