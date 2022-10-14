package it.business.user;

import org.apache.maven.shared.utils.StringUtils;

import it.business.card.CardBusiness;
import it.business.card.exception.CardBusinessException;
import it.model.player.Player;
import it.model.user.User;
import it.model.user.exceptions.UserException;

public final class UserBusiness {

	public final User createUser(final String username, final Integer numberOfCards) throws UserException, CardBusinessException {
		if (StringUtils.isBlank(username) && !username.contains("[0-9]")) {
			throw new UserException("User is blank or empty");
		}
		
		if(numberOfCards==null) {
			throw new UserException("Number of cards is blank or empty");
		}
		return new Player(username.trim(), cardBusiness.createCards(numberOfCards));
	}
	private CardBusiness cardBusiness;
}
