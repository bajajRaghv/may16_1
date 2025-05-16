package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;


@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void startH2Console() throws SQLException {
		Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082").start();
	}
}