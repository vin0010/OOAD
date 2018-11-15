package com.codex.solid.template;

import java.util.List;

public class AccountsPayable {
	List<Player> players;

	public AccountsPayable(List<Player> players) {
		// TODO Auto-generated constructor stub
		this.players = players;
	}

	public void payEveryone() {
		for (Player player : this.players) {
			player.pay();
		}
	}
}
