package com.springcore.javaconfug;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
   
	@Bean(name = {"water"})
	public Water getWater() {
		return new Water(200);
	}
	
	@Bean(name = {"bottle"})
	public Bottle getBottle() {
		return new Bottle(500, getWater());
	}
}
