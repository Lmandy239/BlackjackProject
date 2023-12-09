package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class BlackjackHand extends Hand {
	private List<Card> blackJackHand;

	public BlackjackHand() {

	}

	@Override
	public List<Card> getHandValue() {
		int InitialValue = 0;
		Deck deck = new Deck();
		deck.shuffle();
		List<Card> hand = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Card cardDeal = deck.dealCard();
			InitialValue += cardDeal.getValue();
			hand.add(cardDeal);

		}

		printHandAndValue(hand, InitialValue);
		return hand;
	}

	private void printHandAndValue(List<Card> hand, int initialValue) {

		if (initialValue <= 21) {
			for (Card card : hand) {
				System.out.println(card);
			}
			System.out.println("Total value: " + initialValue);
		} else {
			getHandValue();
		}
	}

	public boolean isBlackJack() {
		return false;

	}

	public boolean isBust() {
		return false;

	}

}
