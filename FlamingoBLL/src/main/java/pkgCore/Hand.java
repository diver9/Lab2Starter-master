package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
	
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] =0;
		iScore[1] =0;
		Collections.sort(cards);
		
		boolean isAce=false;
		for (Card c: cards)
		{
			iScore[0]+=c.geteRank().getMin();
			if (c.geteRank()==eRank.ACE){
				isAce=true;
			}
		}
		iScore[1]=(isAce)?iScore[0]+10:iScore[0];
		SetHandScore(iScore);
		return iScore;
	}
	
	public void Draw(Deck d) throws Exception
	{
		
		cards.add(d.draw());
	}
	public  boolean isDealerDraw() {
		for (int iSccore:ScoreHand()) {
			if (iScore>=17){
			return false;
			}
		}
		return true;
	}
	public  boolean isPlayerDraw() {
		for (int iSccore:ScoreHand()) {
			if (iScore<21){
			return true;
			}
		}
		return false;
	}
	
	public boolean isBlackJack() {
		int[] iScores=ScoreHand();
		if ((iScores[1]==21)&&(cards.size()==2)) {
			return true;
			
		}
		return false;
	}
	
	public void SetHandScore(int[] Scores) {
		this.iScore=Scores[0];
		if (Scores[1]<=21){
			iScore=Scores[1];
		}
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
