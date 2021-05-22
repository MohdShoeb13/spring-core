package com.springcore.ref;

public class Car {
   
	private String brand;
    private String model;
    private Engine engine;
    
	public Car() {
		super();
	}

	public Car(String brand, String model, Engine engine) {
		super();
		this.brand = brand;
		this.model = model;
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", engine=" + engine + "]";
	}
    
    
}
