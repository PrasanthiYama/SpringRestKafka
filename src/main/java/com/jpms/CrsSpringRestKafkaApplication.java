package com.jpms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jpms.rest"})
public class CrsSpringRestKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsSpringRestKafkaApplication.class, args);
	}

}
