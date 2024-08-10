package com.example.LambdaTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaTestApplication.class, args);
		System.out.println("Hello Lambda");
	}

}
