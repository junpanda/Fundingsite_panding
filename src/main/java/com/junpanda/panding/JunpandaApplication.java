package com.junpanda.panding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JunpandaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunpandaApplication.class, args);
	}

}
