package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Dealer extends Player {

	private Deck deck = new Deck();


	public Dealer() {
		super();
	}

	
	public Deck getDeck() {
		return deck;
	}


	public void setDeck(Deck deck) {
		this.deck = deck;
	}


	public int checkDeckSize() {
		return deck.checkDeckSize();

	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public void shuffle() {
		deck.shuffle();
	}
	public void dealersTurn() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(deck);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dealer other = (Dealer) obj;
		return Objects.equals(deck, other.deck);
	}


	@Override
	public String toString() {
		return getHand() + "";
	}

}
