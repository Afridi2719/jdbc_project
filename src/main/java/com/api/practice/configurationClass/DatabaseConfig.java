package com.api.practice.configurationClass;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

import jakarta.activation.DataSource;

@Configuration
public class DatabaseConfig {
	
	public DataSource dataSource() {
		return (DataSource) DataSourceBuilder.create()
				.url("jdbc:mysql://localhost:3306/test")
				.username("root")
				.password("6303")
				.driverClassName("com.mysql.cj.jdbc.Driver")
				.build();
	}
}
