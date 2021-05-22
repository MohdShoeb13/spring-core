package com.springcore.autowiring.xml;

public class PCParts {
   
	private String ram;
	private String motherboards;
	public PCParts() {
		super();
		
	}
	public PCParts(String ram, String motherboards) {
		super();
		this.ram = ram;
		this.motherboards = motherboards;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getMotherboards() {
		return motherboards;
	}
	public void setMotherboards(String motherboards) {
		this.motherboards = motherboards;
	}
	
	@Override
	public String toString() {
		return "PCParts [ram=" + ram + ", motherboards=" + motherboards + "]";
	}
	
	
}
