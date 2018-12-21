package com.sample.mongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.sample.mongo.repo.UserRepository;

@Configuration
@EnableMongoRepositories (basePackageClasses= UserRepository.class)
public class MongoDBConfig {

	
}
