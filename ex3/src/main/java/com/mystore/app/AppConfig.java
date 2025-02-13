package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mystore.app")
public class AppConfig {
	@Bean
	public Product product(Barcode barcode) {
		return new Product("Sample Product",barcode);
	}
}
