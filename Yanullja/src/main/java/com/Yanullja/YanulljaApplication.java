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
//		System.out.println("    111ㅂㅂ  ");
		System.out.println("...............................................");
	}
}
