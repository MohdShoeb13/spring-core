package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInterfaceImplemet {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		MyIBean myIBean = context.getBean(MyIBean.class,"theBean");
		System.out.println(myIBean);
		context.registerShutdownHook();
		context.close();

	}

}
