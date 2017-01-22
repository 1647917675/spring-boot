package com.example.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation.ProjectionOperationBuilder;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientOptions.Builder;
import com.mongodb.MongoClientURI;

@Configuration
public class AppConfig {

	@Autowired
	MongoProperties mongoProperties;

	@Bean 
	MongoClient getMongoClient(){
		Builder builder = MongoClientOptions.builder();
		builder.connectionsPerHost(2);
		builder.socketTimeout(10000);
		builder.serverSelectionTimeout(10000);
//		builder.connectTimeout(10);//连接超时
		builder.maxConnectionLifeTime(1000*6);
		
		MongoClient  client = new MongoClient(new MongoClientURI(mongoProperties.getUri(),
				builder));
		return client;
	}
}
