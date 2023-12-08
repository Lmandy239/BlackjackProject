package com.skilldistillery.blackjack.entities;

public enum Suit {

	
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	
	private String name = "";
	
	Suit() {
		// TODO Auto-generated constructor stub
	}
	
	Suit(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return name;
	}
	
	
	
}
