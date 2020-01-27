package com.bank_sekolah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class SpringBootBankSekolah1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBankSekolah1Application.class, args);
		
		
	}
	
}
