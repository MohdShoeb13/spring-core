package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fighter")
public class TekkenFighter {
  
  @Value("Jin Kazama")
  private String name;
  
  @Value("#{moves}")
  private List<String> moves;
  

  public List<String> getMoves() {
	return moves;
}

public void setMoves(List<String> moves) {
	this.moves = moves;
}

public TekkenFighter() {
	super();
	
   }

public TekkenFighter(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "TekkenFighter [name=" + name + "]";
}
  
  
  
  
}
