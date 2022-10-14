package it.model.card.enums;

public enum CardEnum {
	NUMBER_COLUM(10),NUMBER_COLUM_POPOLATED(5), NUMBER_ROW(3);

	private Integer value;

	private CardEnum(Integer value) {
		this.value = value;
	}

	public final Integer getValue() {
		return this.value;
	}
}
