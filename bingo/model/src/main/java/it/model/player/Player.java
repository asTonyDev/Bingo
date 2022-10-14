package it.model.player;

import java.util.List;

import it.model.card.Card;
import it.model.user.User;

public class Player extends User {

	public Player(String username, List<Card> list) {
		super(username,list);
	}
}
