package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
		deck.shuffle();
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


	public void shuffle() {
		deck.shuffle();

		
	}
	@Override
	public String toString() {
		
		return hand.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(deck, hand);
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
		return Objects.equals(deck, other.deck) && Objects.equals(hand, other.hand);
	}

}
