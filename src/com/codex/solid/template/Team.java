package com.codex.solid.template;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private List<Player> playersList = new ArrayList<Player>();
	private String name;

	public Team(String name) {
		this.name = name;
	}

	public void addPlayer(Player player) {
		this.playersList.add(player);
	}

	public String getName() {
		return name;
	}

}
