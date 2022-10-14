package it.model.card.enums;

public enum CardBusinessErrorEnum {
	NUMBER_OF_CARDS_NULL(1,"Number of cards must not be null"),
	NUMBER_OF_CARDS_ZERO(1,"Number of cards must not be 0");

	private Integer idError;
	private String errorDescription;

	private CardBusinessErrorEnum(Integer idError) {
		this.idError = idError;
	}
	private CardBusinessErrorEnum(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	private CardBusinessErrorEnum(Integer idError,String errorDescription) {
		this.idError = idError;
		this.errorDescription = errorDescription;
	}
	public Integer getIdError() {
		return idError;
	}

	public String getErrorDescription() {
		return errorDescription;
	}
}
