package com.prueba.geeks;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GeeksApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeeksApplication.class, args);
	}
	
	 @Bean
	public ModelMapper modelMapper() {
      ModelMapper modelMapper = new ModelMapper();
      return modelMapper;
    }
		 
}
