package com.springcore.ref;

public class Engine {
    
	private String type;

	public Engine() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}
	
	
}
