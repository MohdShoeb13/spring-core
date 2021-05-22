package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Mobile {

	@Autowired
	@Qualifier("sim2")
	private SIM sim;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(SIM sim) {
		super();
		this.sim = sim;
	}

	public SIM getSim() {
		return sim;
	}

	public void setSim(SIM sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile [sim=" + sim + "]";
	}

}
