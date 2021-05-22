package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Rtest {
   
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ref_config.xml");
		
		Car car = context.getBean("car2",Car.class);
		System.out.println(car);
		System.out.println(car.getEngine().getType());
		((AbstractApplicationContext) context).close();
	}
}
