package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class BlackjackHand extends Hand {

	public BlackjackHand() {

	}

	@Override
	public int getHandValue() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}

		return value;
	}


	public boolean isBlackJack() {
		
		
		
		return false;

	}

	public boolean isBust() {
		return false;

	}

}
