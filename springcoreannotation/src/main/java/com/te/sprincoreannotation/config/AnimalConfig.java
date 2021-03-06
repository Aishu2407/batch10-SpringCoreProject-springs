package com.te.sprincoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springannotation.interfaces.Animal;
import com.te.springannotation.interfaces.Dog;
import com.te.springannotation.interfaces.Horse;

@Configuration
public class AnimalConfig {
	
	@Bean
	//@Primary
	public Animal getDog()
	{
		return new Dog();
		
	}

	@Bean
	@Primary
	public Animal getHorse()
	{
		return new Horse();
	}
}
