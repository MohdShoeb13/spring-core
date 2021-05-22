package com.springcore.javaconfug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaRun {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Bottle bottle = context.getBean("bottle",Bottle.class);
		System.out.println(bottle);

	}

}
