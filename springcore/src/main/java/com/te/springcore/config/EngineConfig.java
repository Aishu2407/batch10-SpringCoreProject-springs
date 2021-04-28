package com.te.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcore.bean.Engine;
@Configuration
public class EngineConfig {
	@Bean
	public Engine getEngine()
	{
		Engine engine=new Engine();
		engine.setCc(1000);
		engine.setType("petrol");
		return engine;
	}
	
	
	

}
