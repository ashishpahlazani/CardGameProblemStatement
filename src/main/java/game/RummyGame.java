package game;
import java.util.ArrayList;
import java.util.List;

import inf.ICardSet;
import inf.IShufflingMethod;

public class RummyGame {
	List<ICardSet> cardSets;
	IShufflingMethod shufflingMethod;
	
	public RummyGame(List<ICardSet> cardSets, IShufflingMethod shufflingMethod) {
		this.cardSets = cardSets;
		this.shufflingMethod = shufflingMethod;
		
		ICardSet newCardSet = shufflingMethod.shuffleSet(cardSets.get(0));
		
		for(int index=0; index < newCardSet.getSize(); index++)
		{
			System.out.println(newCardSet.get(index));
		}
		
	}
	
	public static void main(String[] args) {
		ICardSet cardSet = new DefaultCardSet();
		cardSet.add(Card.ACE_CLUB);
		cardSet.add(Card.ACE_DIAMOND);
		cardSet.add(Card.ACE_SPADE);
		cardSet.add(Card.ACE_HEART);
		ArrayList<ICardSet> cardSets = new ArrayList<ICardSet>();
		cardSets.add(cardSet);
		
		new RummyGame(cardSets, new DefaultShufflingMethod());
	}
}
