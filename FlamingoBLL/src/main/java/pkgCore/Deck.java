package pkgCore;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

import pkgEnum.eRank;
import pkgEnum.eSuit;
public class Deck {
	private int n;
	private int a;
	private int b;
	private int c;
	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	 ArrayList<Card> cards = new ArrayList<Card>(52*n);
	public Deck(ArrayList<Card> cards, int n) {
		super();
		this.cards = cards;
		this.n=n;		
		
		for (a=0;a<=n;a++) {
			for (b=0;b<=13;b++)
			{
				cards.add(new Card(eRank.values()[b],eSuit.CLUBS));
				cards.add(new Card(eRank.values()[b],eSuit.DIAMONDS));
				cards.add(new Card(eRank.values()[b],eSuit.HEARTS));
				cards.add(new Card(eRank.values()[b],eSuit.SPADES));
					
				
			}
		}
	
	} 
	
	
	
	

	
	
	//	TODO: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	
	public Card draw() {
	
		return cards.get((int) Math.random() * (52*n));
	
	}
}