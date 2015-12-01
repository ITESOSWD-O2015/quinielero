package com.iteso.quinielero.team.defenders;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class Sweeper  extends Player {
	Team team;
	
	public Sweeper(Team team, String playerName) {
		super(team.getNombre(), team.getTeamID());
		this.team = team;
		this.playerName = playerName;
		this.positionAv = "SW";
	}
	@Override
	public String getPlayers() {
		return team.getPlayers() + "\n" + positionAv+ ": " +playerName;
	}
}
