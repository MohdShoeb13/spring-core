package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Fight {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/c_config.xml");
		
		Player player = context.getBean(Player.class, "player");
		System.out.println(player);
  	}
}
