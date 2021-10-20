package com.bridgelabz.DeckOfCards;

import java.util.ArrayList;

public class DeckOfCards {
	/**
	 * creation of Arraylist
	 **/
	
	public ArrayList<String> cardsdeck = new ArrayList<>();
	/**
	 * Declaration of array for suits and ranks
	 **/
	
	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
	

	/**
	 * Initializing the deck method
	 */
	public void Initializationofdeck() {

		int numOfCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck:" + numOfCards);
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cardsdeck.add(ranks[i] + "->" + suits[j]);
			}
		}
	}


	public static void main(String[] args) {
		System.out.println("welcome to DeckOf Cards program...!");
		DeckOfCards deck = new DeckOfCards();
		deck.Initializationofdeck();
	}
}
