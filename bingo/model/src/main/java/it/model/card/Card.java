package it.model.card;

import javax.management.ConstructorParameters;

import it.model.card.enums.CardEnum;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public final @Data class Card {
	private Integer[][] numberInCard = new Integer[CardEnum.NUMBER_ROW.getValue()][CardEnum.NUMBER_COLUM.getValue()];

	@ConstructorParameters(value = { "numberInCard" })
	public Card(Integer[][] numberInCard) {
		this.numberInCard = numberInCard;
	}
}
