package pkgCore;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

import pkgEnum.eRank;
import pkgEnum.eSuit;
public class Deck {
	private int n;
	private int a;
	private int b;
	private int c;
	 ArrayList<Card> cards = new ArrayList<Card>(52*n);
	public Deck(ArrayList<Card> cards, int n) throws Exception {
		super();
		this.cards = cards;
		this.n=n;		
		if (n<1) {
			throw new Exception ("nubmer of deck <1");
		}
		for (a=1;a<=n;a++) {
			for (b=0;b<13;b++)
			{
				cards.add(new Card(eRank.values()[b],eSuit.CLUBS));
				cards.add(new Card(eRank.values()[b],eSuit.DIAMONDS));
				cards.add(new Card(eRank.values()[b],eSuit.HEARTS));
				cards.add(new Card(eRank.values()[b],eSuit.SPADES));
					
				
			}
		}
		Collections.shuffle(cards);		
	
	} 
	
	
	



	public Card draw() throws Exception {
		if (cards.size()==0) {
			throw new Exception ("nubmer of deck <1");
		}
		return cards.remove(0);
	
	}
}
