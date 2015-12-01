package com.iteso.quinielero.team.forwards;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class CenterForward extends Player {
	Team team;
	
	
	public CenterForward(Team team, String playerName) {
		super(team.getNombre(), team.getTeamID());
		this.team = team;
		this.playerName = playerName;
		this.positionAv = "CF";
	}
	@Override
	public String getPlayers() {
		return team.getPlayers() + "\n" + positionAv+ ": " +playerName;
	}
}
