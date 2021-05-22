package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnoBean {
    private String data;

	public AnnoBean() {
		super();

	}

	public AnnoBean(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		System.out.println("Setting the Data");
		this.data = data;
	}

	@Override
	public String toString() {
		return "AnnoBean [data=" + data + "]";
	}
    
	@PostConstruct
	public void theInit() {
		System.out.println("The Init");
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("The Destroyer");
	}
    
}
