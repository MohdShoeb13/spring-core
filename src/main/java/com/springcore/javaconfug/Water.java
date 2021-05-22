package com.springcore.javaconfug;

public class Water {
   private int ml;

public Water() {
	super();
	
}

public Water(int ml) {
	super();
	this.ml = ml;
}

public int getMl() {
	return ml;
}

public void setMl(int ml) {
	this.ml = ml;
}

@Override
public String toString() {
	return "Water [ml=" + ml + "]";
}
   
   
}
