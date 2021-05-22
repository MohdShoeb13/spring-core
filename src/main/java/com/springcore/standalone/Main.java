package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/standalone_config.xml");
       TestClass testClass = context.getBean(TestClass.class,"test");
       System.out.println(testClass);
	}

}
