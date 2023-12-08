package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApplication {
	private Scanner keyboard;
	Deck deck = new Deck();
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
		String answer;
		System.out.println("Your Deck: ");
		player.getHandValue();
		System.out.println();
		System.out.println("The dealers deck: ");
		dealer.getHandValue();
		
		System.out.println("Would you like to (S)tand or (H)it?: (S or H)");
		answer = keyboard.next();
		do {	
			System.out.println("Would you like to (S)tand or (H)it?: (S or H)");
		if (answer.equalsIgnoreCase("S")) {

			stand();

		} else if (answer.equalsIgnoreCase("H")) {
			Hit();
		} 
		
		break;
		}while(!answer.equals("Y") && !answer.equalsIgnoreCase("N"));
		
		
		
		
	}


	public void stand() {
	   
		System.out.println("You chose to stand");
		
	}
	
	public void Hit() {
		System.out.println("You chose to Hit");
	}
	
}
