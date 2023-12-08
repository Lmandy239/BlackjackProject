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

	public static void main(String[] args) {
		BlackJackApplication app = new BlackJackApplication();
		Player player = new Player();
		Dealer dealer = new Dealer();

		
		
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
		shuffle();
		

	}

	public void shuffle() {
		deck.shuffle();

		
	}

	public void stand() {
	   
	}
	
}
