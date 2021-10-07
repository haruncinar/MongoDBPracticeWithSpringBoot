package com.cinar.MinSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//MongoRepository'nin çalışması için EnableMongoRepository anotasyonunu ekledik.
@SpringBootApplication
@EnableMongoRepositories("com.cinar.MinSB.repository")
public class MongoBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoBootAppApplication.class, args);
	}

}
