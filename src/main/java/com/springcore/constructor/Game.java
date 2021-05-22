package com.springcore.constructor;

public class Game {
   private String name;
   private String part;
   
	public Game() {
	super();
   }

	public Game(String name, String part) {
		super();
		this.name = name;
		this.part = part;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", part=" + part + "]";
	}
   
   
}
