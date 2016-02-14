package game;
import java.util.ArrayList;

import inf.ICardSet;
import inf.IShufflingMethod;

public class DefaultShufflingMethod implements IShufflingMethod {

	@Override
	public ICardSet shuffleSet(ICardSet cardSet) {
		int setSize = cardSet.getSize();
		int randomIndex = (int) (Math.random() * setSize);
		ArrayList<Card> newCardsSet = new ArrayList<Card>();

		int firstDeckIndex = 0, secondDeckIndex = randomIndex;
		for (; firstDeckIndex < randomIndex && secondDeckIndex < setSize; firstDeckIndex++, secondDeckIndex++) {
			newCardsSet.add(cardSet.get(firstDeckIndex));
			newCardsSet.add(cardSet.get(secondDeckIndex));
		}

		if (firstDeckIndex < randomIndex) {
			for (int index = firstDeckIndex; index < randomIndex; index++) {
				newCardsSet.add(cardSet.get(firstDeckIndex));
			}
		}
		else if (secondDeckIndex < setSize) {
			for (int index = secondDeckIndex; index < setSize; index++) {
				newCardsSet.add(cardSet.get(firstDeckIndex));
			}
		}

		cardSet.removeAll();
		for(Card card : newCardsSet)
		{
			cardSet.add(card);
		}
		
		return cardSet;
	}

}
