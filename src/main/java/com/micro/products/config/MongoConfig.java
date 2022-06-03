package com.micro.products.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
public class MongoConfig extends AbstractReactiveMongoConfiguration {

    @Value("${spring.data.mongo.uri}")
    private String mongoUri;

    @Override
    protected String getDatabaseName() {
        return "products";
    }

    @Override
    public MongoClient reactiveMongoClient(){

        return MongoClients.create(mongoUri);
    }
}
