package com.iteso.quinielero.team.goalkeeper;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class Goalkeeper extends Player {
	Team team;
	
	
	public Goalkeeper(Team team, String playerName) {
		super(team.getNombre(), team.getTeamID());
		this.team = team;
		this.playerName = playerName;
		this.positionAv = "GK";
	}
	@Override
	public String getPlayers() {
		return team.getPlayers() + "\n" + positionAv+ ": " +playerName;
	}
}
