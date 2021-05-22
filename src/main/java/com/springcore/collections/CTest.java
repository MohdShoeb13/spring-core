package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/c_config.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		
		((AbstractApplicationContext) context).close();
	}

}
