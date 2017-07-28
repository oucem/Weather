package com.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.*;

@SpringBootApplication
public class WeatherApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("org.postgresql.Driver");
		System.out.println("CONNECTION TO PostgeSQL PASSED!!");
		SpringApplication.run(WeatherApplication.class, args);
	}
}
