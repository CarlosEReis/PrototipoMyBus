package com.carloser7.covertrafi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CoverTrafiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoverTrafiApplication.class, args);
	}
}
