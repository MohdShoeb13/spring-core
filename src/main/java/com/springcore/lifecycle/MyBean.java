package com.springcore.lifecycle;

public class MyBean {
   
	private String data;

	public MyBean() {
		super();
		
	}

	public MyBean(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		System.out.println("Setting data");
		this.data = data;
	}
	
	public void myInit() {
		System.out.println("Init method called");
	}
	
	public void myDestroy() {
		System.out.println("My Destroy called");
	}

	@Override
	public String toString() {
		return "MyBean [data=" + data + "]";
	}
	
	
}
