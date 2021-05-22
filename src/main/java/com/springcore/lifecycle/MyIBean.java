package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class MyIBean implements InitializingBean,DisposableBean {
    private String data;
     

	public MyIBean() {
		super();
		
	}

	public MyIBean(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		System.out.println("Setting properties");
		this.data = data;
	}

	@Override
	public String toString() {
		return "MyIBean [data=" + data + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Destroy");
	}
    
    
}
