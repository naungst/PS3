package pkgCore;
import static org.junit.Assert.*;
import org.junit.Test;
import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class DeckTest 
{

	@Test (expected = DeckException.class) 
	public void TestEmptyDeck() throws DeckException 
	{
		Deck Deck1 = new Deck();
		for (int z = 1; z <= 100; z++) 
		{
			Deck1.Draw();
		}		
	}
	
	@Test
	public void TestDrawSuit() 
	{
		Deck Deck1 = new Deck();
		Card Card1 = Deck1.Draw(eSuit.DIAMONDS);
		assertTrue(Card1.geteSuit() == eSuit.DIAMONDS);
	}
	
	@Test
	public void TestDrawRank() 
	{
		Deck Deck1 = new Deck();
		Card Card1 = Deck1.Draw(eRank.FOUR);
		assertTrue(Card1.geteRank() == eRank.FOUR);
	}
	
	@Test
	public void TestDeckRankCount() 
	{
		Deck Deck1 = new Deck();
		assertEquals(Deck1.Count(eRank.THREE), 4);
	}
	
	@Test
	public void TestDeckSuitCount() 
	{
		Deck Deck1 = new Deck();
		assertEquals(Deck1.Count(eSuit.CLUBS), 13);
	}

}