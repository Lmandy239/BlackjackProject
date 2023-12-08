package com.skilldistillery.blackjack.entities;

import java.util.*;

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
