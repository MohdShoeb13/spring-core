package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXML {
    public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		MyBean myBean =context.getBean(MyBean.class,"myBean");
		System.out.println(myBean);
		context.registerShutdownHook();
		context.close();
	}
}
