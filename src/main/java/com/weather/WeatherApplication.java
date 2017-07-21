package com.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.*;

@SpringBootApplication
public class WeatherApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("APP STARTED");
	
		Class.forName("org.postgresql.Driver");

		String url = "jdbc:postgresql://localhost/weather?ssl=true";
		@SuppressWarnings("unused")
		Connection conn = DriverManager.getConnection(url);
		
		System.out.println("CONNECTION TO PostgeSQL PASSED!!");
		SpringApplication.run(WeatherApplication.class, args);
	}
}
