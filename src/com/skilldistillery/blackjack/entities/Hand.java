package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand{

	protected List<Card> cards;

	public Hand() {

	}
	public List<Card> getHandValue() {
		return null;
		
		
	}
	
	public void addCard(Card card){
		cards = new ArrayList<>();
		cards.add(card);
	}
	
	public void clearHand() {
		cards.removeAll(cards);
	}
	


	@Override
	public String toString() {
		return "Hand: " + cards + "";
	}



	                                 
	
	


}
