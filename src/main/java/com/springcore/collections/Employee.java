package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
     
	private int eid;
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> languageProfes;
	
	public Employee() {
		super();
	}
	
	

	public Employee(int eid, String name, List<String> phones, Set<String> address,
			Map<String, String> languageProfes) {
		super();
		this.eid = eid;
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.languageProfes = languageProfes;
	}



	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getLanguageProfes() {
		return languageProfes;
	}

	public void setLanguageProfes(Map<String, String> languageProfes) {
		this.languageProfes = languageProfes;
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", phones=" + phones + ", address=" + address
				+ ", languageProfes=" + languageProfes + "]";
	}
	
	
}
