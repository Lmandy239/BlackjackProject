package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApplication {
	private Scanner keyboard;
	private List<Card> playersHand;
	private List<Card> dealersHand;
	 private Player player = new Player();
	 private Dealer dealer = new Dealer();
	 Deck deck = new Deck();
	
	public static void main(String[] args) {
		BlackJackApplication app = new BlackJackApplication();

		
		
		app.run();

	}

	public void run() {
		menu();

	}

	public void menu() {
		keyboard = new Scanner(System.in);
		String answer;
		System.out.println("Hello! would you like to play some BlackJack? (Y/N): ");
		answer = keyboard.next();

		if (answer.equalsIgnoreCase("Y")) {

			startMatch();

		} else if (answer.equalsIgnoreCase("N")) {
			System.out.println("GoodBye!");
			System.exit(0);
		} else {
			System.out.println("Invalid answer try again!");
			menu();
		}

	}

	public void startMatch() {
		    playerHand();
		    System.out.println("\n..................................................... \n");
		    dealerHand();
		    
		    String answer;
		    do {
		    System.out.println("Would you like to (S)tand or (H)it?: (S or H)");
		    answer = keyboard.next();

		    if (answer.equalsIgnoreCase("S")) {
		        stand();
		    } else if (answer.equalsIgnoreCase("H")) {
		       Hit();
		    } else {
		        System.out.println("Invalid input. Please enter either 'S' or 'H'.");
		    }
		} while (!answer.equalsIgnoreCase("S") && !answer.equalsIgnoreCase("H"));
		
		
		
	}
	public void playerHand() {
		System.out.println("Your Deck: ");
		playersHand = player.getHandValue();
	 
	}
	public void dealerHand() {
		System.out.println("The dealers deck: ");
		dealersHand = dealer.getHandValue();
	    int dealerValue = calculateHandValue(dealersHand);
//	 if(dealerValue <= 17) {
//		Hit();
//	 }
	   
	}

	public void stand() {
	   
	    System.out.println("You chose to stand");

	    int playerValue = calculateHandValue(playersHand);
	    int dealerValue = calculateHandValue(dealersHand);

	    System.out.println("Your hand value: " + playerValue);
	    System.out.println("Dealer's hand value: " + dealerValue);

	    if (playerValue > 21) {
	        System.out.println("Bust! You lose.");
	    } else if (dealerValue > 21) {
	        System.out.println("Dealer busts! You win.");
	    } else if (playerValue > dealerValue) {
	        System.out.println("You win!");
	    } else if (playerValue < dealerValue) {
	        System.out.println("You lose.");
	    } else {
	        System.out.println("It's a tie!");
	    }
	}
	
	private int calculateHandValue(List<Card> hand) {
		
	   int handValue = 0;
	    for (Card card : hand) {
	        handValue += card.getValue();
	    }
	    return handValue;
	}

	public void Hit() {
		System.out.println("Adding one Card..");
		Card newCard = deck.dealCard();
		player.addCard(newCard);
		player.getHandValue();
	}
	
}
