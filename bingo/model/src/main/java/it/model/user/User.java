package it.model.user;

import java.util.ArrayList;
import java.util.List;

import it.model.card.Card;
import it.model.user.interfaces.UserInterface;
import lombok.Data;

public abstract @Data class User implements UserInterface {

	public User(String username, List<Card> list) {
	}
	protected String usernaeme;
	protected List<Card> cards = new ArrayList<Card>();

}
