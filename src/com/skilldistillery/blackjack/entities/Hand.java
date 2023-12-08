package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> cards;

	public Hand() {
	}


	public void getHandValue() {

	}

	@Override
	public String toString() {
		return "Your cards: " + cards;
	}

	public abstract void addCard(List<Card> cards);

}
