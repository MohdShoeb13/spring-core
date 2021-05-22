package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
          ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotate_config.xml");
          TekkenFighter fighter = context.getBean(TekkenFighter.class,"fighter");
          System.out.println(fighter.getName());
          System.out.println(fighter.getMoves());
	}

}
