package com.springcore.constructor;

import java.util.List;

public class Player {
   
	private String name;
	private List<String> moves;
	private Game game;
	
	public Player() {
		super();
	}

	public Player(String name, List<String> moves, Game game) {
		super();
		this.name = name;
		this.moves = moves;
		this.game = game;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMoves() {
		return moves;
	}

	public void setMoves(List<String> moves) {
		this.moves = moves;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", moves=" + moves + ", game=" + game + "]";
	}
	

}
