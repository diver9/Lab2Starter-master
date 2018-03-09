package pkgCore;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() throws Exception {
		ArrayList<Card> cards1 = new ArrayList<Card>();
		Deck b=new Deck(cards1,1);
		assertTrue(b.cards.size()==52);
		ArrayList<Card> cards2 = new ArrayList<Card>();
		Deck a=new Deck(cards2,6);
		assertTrue(a.cards.size()==312);
	}

}
