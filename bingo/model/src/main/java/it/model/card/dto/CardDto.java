package it.model.card.dto;

import it.model.card.enums.CardEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public final @Data class CardDto {
	@SuppressWarnings("unused")
	private Integer[][] numberInCard = new Integer[CardEnum.NUMBER_ROW.getValue()][CardEnum.NUMBER_COLUM.getValue()];
}
