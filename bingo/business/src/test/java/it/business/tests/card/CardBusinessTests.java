package it.business.tests.card;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import it.business.card.CardBusiness;
import it.business.card.exception.CardBusinessException;
import it.model.card.enums.CardBusinessErrorEnum;

public class CardBusinessTests {

	@Test
	public void testCreateCardsTestOk() throws CardBusinessException {
		assertNotNull(card.createCards(1));
	}

	@Test
	public void testCreateCardsTestNullCardKo()  {
		CardBusinessException businessException = assertThrows(
				CardBusinessException.class ,
				() -> { card.createCards(null);
		});
		assertTrue(businessException
				.getMessage()
				.contains(
						CardBusinessErrorEnum.NUMBER_OF_CARDS_NULL.getErrorDescription()
						)
				);
	}
	
	@Test
	public void testCreateCardsTesteroCardKo()  {
		CardBusinessException businessException = assertThrows(
				CardBusinessException.class ,
				() -> { card.createCards(0);
		});
		assertTrue(businessException
				.getMessage()
				.contains(
						CardBusinessErrorEnum.NUMBER_OF_CARDS_NULL.getErrorDescription()
						)
				);
	}


	private CardBusiness card = new CardBusiness(); 
}
