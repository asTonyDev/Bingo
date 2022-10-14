package it.model.bingo.enums;

public enum BingoEnum {
	MAX_NUMBER(90), MIN_NUMBER(1);

	private Integer value;

	private BingoEnum(Integer value) {
		this.value = value;
	}

	public final Integer getValue() {
		return this.value;
	}
}
