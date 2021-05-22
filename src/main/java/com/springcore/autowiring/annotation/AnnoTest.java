package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/annotate_config.xml");
		
		Mobile mobile = context.getBean(Mobile.class,"mobile");
		System.out.println(mobile);
 	}
}
