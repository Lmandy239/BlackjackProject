package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand{

	protected List<Card> cards;

	public Hand() {
		cards = new ArrayList<>();
	}
	public abstract int getHandValue();
	
	public void addCard(Card card){
		cards.add(card);
	}
	
	public void clearHand() {
		cards.removeAll(cards);
	}
	


	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	@Override
	public String toString() {
		return cards + "";
	}


	                                 
	
	


}
