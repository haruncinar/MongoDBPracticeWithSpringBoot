package com.cinar.mongopracticeinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//MongoRepository'nin çalışması için EnableMongoRepository anotasyonunu ekledik.
@SpringBootApplication
@EnableMongoRepositories("com.cinar.mongopracticeinspringboot.repository")
public class MongoBootAppApplication {

	public static void main(String[] args) {
		try
		{
			SpringApplication.run(MongoBootAppApplication.class, args);
		}
		catch (Exception exception)
		{
			System.out.println("SpringBootApplication deploy olurken hata alındı. Hata detayı: "+ exception.getMessage());
		}
	}

}
