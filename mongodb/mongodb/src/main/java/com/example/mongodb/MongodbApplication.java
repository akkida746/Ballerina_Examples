package com.example.mongodb;

import com.example.mongodb.entity.Customer;
import com.example.mongodb.repository.CustomerRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbApplication {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	CommandLineRunner runner(){
		return args -> {
			System.out.println("Started...");
		};
	}

}
