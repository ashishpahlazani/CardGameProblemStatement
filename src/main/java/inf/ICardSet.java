package inf;

import game.Card;

public interface ICardSet {
	public int getSize();
	public Card get(int index);
	public void removeAll();
	public void add(Card card);
}
