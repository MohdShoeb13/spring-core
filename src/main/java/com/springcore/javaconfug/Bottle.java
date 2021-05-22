package com.springcore.javaconfug;

public class Bottle {
     private int capacity;
     private Water water;
     
	public Bottle() {
		super();
		
	}
	public Bottle(int capacity, Water water) {
		super();
		this.capacity = capacity;
		this.water = water;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Water getWater() {
		return water;
	}
	public void setWater(Water water) {
		this.water = water;
	}
	
	@Override
	public String toString() {
		return "Bottle [capacity=" + capacity + ", water=" + water + "]";
	}
     
}
