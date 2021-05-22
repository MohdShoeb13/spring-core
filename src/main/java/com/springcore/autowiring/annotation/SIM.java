package com.springcore.autowiring.annotation;

public class SIM {
   private String company;

public SIM() {
	super();
	
}

public SIM(String company) {
	super();
	this.company = company;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

@Override
public String toString() {
	return "SIM [company=" + company + "]";
}
   
   
}
