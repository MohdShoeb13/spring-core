package com.springcore.autowiring.xml;

public class Cabinet {
    
	private PCParts parts;

	public Cabinet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cabinet(PCParts parts) {
		super();
		this.parts = parts;
	}

	public PCParts getParts() {
		return parts;
	}

	public void setParts(PCParts parts) {
		this.parts = parts;
	}

	@Override
	public String toString() {
		return "Cabinet [parts=" + parts + "]";
	}
	
	
}
