package com.skilldistillery.blackjack.entities;

import java.util.Objects;

public class Player {
	protected Hand hand = new BlackjackHand();

	public Player() {

	}

	public void addCard(Card card) {
		hand.addCard(card);
	}

	public Hand getHand() {
	
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hand);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(hand, other.hand);
	}

	@Override
	public String toString() {
		return "" + getHand();
	}

}
