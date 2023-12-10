package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApplication {
	private Scanner keyboard;

	private Player player = new Player();
	private Dealer dealer = new Dealer();

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
		player.addCard(dealer.dealCard());
		player.addCard(dealer.dealCard());

		dealer.addCard(dealer.dealCard());
//		dealer.addCard(dealer.dealCard());

		playerHand();
		System.out.println("\n..................................................... \n");
		dealerHand();
		dealer.dealersTurn();
		playerTurn();

	}

	public void playerTurn() {
		String answer;
		do {
			System.out.println("Would you like to (S)tand or (H)it?: (S or H)");
			answer = keyboard.next();

			if (answer.equalsIgnoreCase("S")) {
				stand();
			} else if (answer.equalsIgnoreCase("H")) {
				hit();
			} else {
				System.out.println("Invalid input. Please enter either 'S' or 'H'.");
			}
		} while (!answer.equalsIgnoreCase("S") && !answer.equalsIgnoreCase("H"));

	}

	public void playerHand() {
		System.out.println("Your hand: ");
		System.out.println(player.toString());

	}

	public void dealerHand() {
		System.out.println("The dealers cards: ");
		System.out.println(dealer.toString());

	}

	public void finalValue() {
		System.out.println("Final hands:");
		System.out.println("Your hand: " + player.getHand());
		System.out.println("Dealer's hand: " + dealer.getHand());

	}

	public void stand() {
		finalValue();
		int playerHandValue = player.getHand().getHandValue();
		int dealerHandValue = dealer.getHand().getHandValue();

		if (playerHandValue > 21) {
			System.out.println("You busted! Dealer wins.");
		} else if (dealerHandValue > 21) {
			System.out.println("Dealer busted! You win.");
		} else if (playerHandValue == dealerHandValue) {
			System.out.println("It's a push. No one wins.");
		} else if (playerHandValue == 21) {
			System.out.println("Blackjack! You win!");
		} else if (dealerHandValue == 21) {
			System.out.println("Dealer has Blackjack. Dealer wins.");
		} else if (playerHandValue > dealerHandValue) {
			System.out.println("You win!");
		} else {
			System.out.println("Dealer wins.");
		}

	}

	public void hit() {
		String answer;

		player.addCard(dealer.dealCard());

		int playerHandValue = player.getHand().getHandValue();
		int dealerHandValue = dealer.getHand().getHandValue();

		if (playerHandValue > 21) {
			System.out.println("You busted! Dealer wins.");
			finalValue();
		} else if (dealerHandValue > 21) {
			System.out.println("Dealer busted! You win.");
			finalValue();
		
		} else if (playerHandValue == dealerHandValue) {
			
			System.out.println("It's a push. No one wins.");
			finalValue();
		} else if (playerHandValue == 21) {
			System.out.println("Blackjack! You win!");
			finalValue();
			
		} else if (dealerHandValue == 21) {
			System.out.println("Dealer has Blackjack. Dealer wins.");
			finalValue();
			
		} else if (playerHandValue > dealerHandValue) {
			System.out.println("You win!");
			finalValue();
			
		} else if (playerHandValue < 17) {
			playerHand();
			System.out.println("Would you like to (H)it or (S)tand?");
			answer = keyboard.next();
			if (answer.equalsIgnoreCase("S")) {
				stand();
			} else if(answer.equalsIgnoreCase("H")) {
				hit();
			}
		} else {
			finalValue();
			System.out.println("Dealer wins.");
		}

//

	}
}
