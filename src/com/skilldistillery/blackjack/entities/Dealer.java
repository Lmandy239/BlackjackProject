package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dealer extends Player{;
	Player computer;
	
	@Override
	public void getHandValue() {
		int initialValue = 0;
		deck.shuffle();
		List<Card> hand = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			Card c = deck.dealCard();
			initialValue += c.getValue();
			hand.add(c);

		}
		printHandAndValue(hand, initialValue);

	}
	
	@Override
	public void printHandAndValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(computer);
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
		return Objects.equals(computer, other.computer);
	}
	
	


}
