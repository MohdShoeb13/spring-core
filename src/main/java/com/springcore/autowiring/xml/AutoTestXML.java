package com.springcore.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTestXML {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/xml/anno_config.xml");
		Cabinet cabinet = context.getBean(Cabinet.class,"cabinet");
		System.out.println(cabinet);

	}

}
