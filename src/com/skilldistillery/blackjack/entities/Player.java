package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Player extends Hand {
	private Hand hand = new BlackjackHand();
	Deck deck = new Deck();

	public Player() {

	}
	@Override
	public void addCard(List<Card> cards) {
		
		hand.addCard(cards);
		
	}

	@Override
	public void getHandValue() {
		int initialValue = 0;
		List<Card> hand = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			Card c = deck.dealCard();
			initialValue += c.getValue();
			hand.add(c);

		}
		printHandAndValue(hand, initialValue);

	}

	public void printHandAndValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("Total value: " + value);
	}


	@Override
	public String toString() {
		
		return hand.toString();
	}

}
