package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		AnnoBean annoBean = context.getBean(AnnoBean.class, "bean");
		System.out.println(annoBean);
		context.registerShutdownHook();

	}

}
