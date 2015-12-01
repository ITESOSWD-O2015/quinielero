package com.iteso.quinielero.team.defenders;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class CenterBack  extends Player {
	Team team;
	
	public CenterBack(Team team, String playerName) {
		super(team.getNombre(), team.getTeamID());
		this.team = team;
		this.playerName = playerName;
		this.positionAv = "CB";
	}
	@Override
	public String getPlayers() {
		return team.getPlayers() + "\n" + positionAv+ ": " +playerName;
	}
}
