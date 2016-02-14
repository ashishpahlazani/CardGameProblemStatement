package game;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import inf.ICardSet;

public class DefaultCardSet implements ICardSet{

	private List<Card> cardsList = new LinkedList<Card>();
	
	@Override
	public int getSize() {
		return cardsList.size();
	}

	@Override
	public Card get(int index) {
		return cardsList.get(index);
	}

	@Override
	public void removeAll() {
		Iterator<Card> listIterator = cardsList.iterator();
		while(listIterator.hasNext())
		{
			listIterator.next();
			listIterator.remove();
		}
	}

	@Override
	public void add(Card card) {
		cardsList.add(card);
	}
	
}
