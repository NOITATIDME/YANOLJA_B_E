package com.Yanullja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class YanulljaApplication {

	public static void main(String[] args) {
		SpringApplication.run(YanulljaApplication.class, args);
		home();
	}

	static void home() {

		System.out.println("...............................................");
//		System.out.println("    TEST 2022-12-29 박가람      ");//
		System.out.println("...............................................");
	}
}
