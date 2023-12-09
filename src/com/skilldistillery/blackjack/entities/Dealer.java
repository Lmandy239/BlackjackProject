package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer extends Player {
	
	Player computer;
	Deck deck = new Deck();

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

	System.out.println(hand.get(0));	
	System.out.println("Hidden Card");		
		

	}

	public int checkDeckSize() {
		return cards.size();

	}

	public Card dealCard() {
		return cards.remove(0);
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

}
