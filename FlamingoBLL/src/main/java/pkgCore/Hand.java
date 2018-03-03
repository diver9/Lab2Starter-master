package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int a;
	private int b;
	private int x;
	public Hand()
	{
	
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[1];
		
		iScore[0] = 0;
		
		Collections.sort(cards);
		

		for (Card c: cards)
		{
			a=c.geteRank().getiRankNbr();
			if (c.geteRank().getiRankNbr()>10) {
				a=10;
			}
			if (c.geteRank().getiRankNbr()==1||c.geteRank().getiRankNbr()==14)
			{	
				b=cards.indexOf(c);
				x=iScore[0];
				
				
				if (b==cards.size()-1&&((x+=11)<=21)) {
					a=11;
				}
				else {
					a=1;
						
				}
			}
			iScore[0]+=a;
			//	TODO: Determine the score.  
			//			Cards:
			//			2-3-4 - score = 11
			//			5-J-Q - score = 25
			//			5-6-7-2 - score = 20
			//			J-Q	- score = 20
			//			8-A = score = 9 or 19
			//			4-A = score = 5 or 15
		}
		
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		cards.add(d.draw());
		//	TODO: add a card to 'cards' from a card drawn from Deck d
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
