package it.business.card;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.management.ConstructorParameters;

import it.business.card.exception.CardBusinessException;
import it.model.bingo.enums.BingoEnum;
import it.model.card.Card;
import it.model.card.enums.CardBusinessErrorEnum;
import it.model.card.enums.CardEnum;
import it.utility.generator.number.NumberGeneratorUtils;

/**
 * @author anton
 * @TestClass CardBusinessTests
 */

public final class CardBusiness {

	public final List<Card> createCards (
			final Integer numberOfCards) 
					throws CardBusinessException {
		if(numberOfCards == null) {
			throw new CardBusinessException(CardBusinessErrorEnum.NUMBER_OF_CARDS_NULL.getErrorDescription());
		}else if(numberOfCards <= 0) {
			throw new CardBusinessException(CardBusinessErrorEnum.NUMBER_OF_CARDS_ZERO.getErrorDescription());
		}
		List<Card> cards = new ArrayList<>();
		for (int i = 0; i < numberOfCards; i++) {
			cards.add(createCard());
		}
		return cards;
	}

	private final Card createCard(){
		final Integer[][] card = new Integer[CardEnum.NUMBER_ROW.getValue()][CardEnum.NUMBER_COLUM.getValue()];
		final Set<Integer> extractsNumbers = new HashSet<>();
		final Set<Integer> extractsIndex = new HashSet<>();
		for (int rowIndex = 0; rowIndex < card.length; rowIndex++) {
			for (int columIndex = 0; columIndex <CardEnum.NUMBER_COLUM_POPOLATED.getValue(); columIndex++) {
				int indexOfColum;
				while (true) {
					indexOfColum = NumberGeneratorUtils.generateNumber(1,9);
					if(extractsIndex.add(indexOfColum)) {
						break;
					}
				}
				card[rowIndex][indexOfColum] = generateNumberToInsertInCard(extractsNumbers,extractsIndex,indexOfColum);
			}
		}
		return new Card(card);
	}

	private final Integer generateNumberToInsertInCard(
			final Set<Integer> extractsNumbers,
			final Set<Integer> extractsIndex, 
			final int indexOfColum){
		Integer numberExtracted;

		while (true) {
			numberExtracted = NumberGeneratorUtils
					.generateNumber(
							getMinRange(indexOfColum),
							getMaxRange(indexOfColum));
			if(extractsNumbers.add(numberExtracted)) {
				break;
			}
		}
		return numberExtracted;
	}

//	private final boolean isInRange(
//			final Set<Integer> extractsNumbers,
//			final Integer numberExtracted) {
//		int countInRangeOfTenOfTime = 0;
//		extractsNumbers.forEach(number ->{
//			if(numberExtracted <= 70 &&  ) {
//
//
//			}
//		});
//		return false;
//	}


	public Integer getMinRange(Integer index) {
		return index*10;
	}
	public Integer getMaxRange(Integer index) {
		return ((index*10)+10)-1;
	}
}
