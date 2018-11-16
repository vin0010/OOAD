package com.codex.solid.template;

public class Organizers {

	public static void main(String[] args) {
		Team team = new Team("Mumbai indians");
		Player player = new AwayPlayer("Pollard", Category.ALLROUNDER, Designation.PLAYER);
		team.addPlayer(player);
		player.pay();
		System.out.println(player.getContractAmount());
	}
}
