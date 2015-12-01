package com.iteso.quinielero.team.forwards;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class WithdrawnStriker extends Player {
	Team team;
	
	
	public WithdrawnStriker(Team team, String playerName) {
		super(team.getNombre(), team.getTeamID());
		this.team = team;
		this.playerName = playerName;
		this.positionAv = "WF";
	}
	@Override
	public String getPlayers() {
		return team.getPlayers() + "\n" + positionAv+ ": " +playerName;
	}
}
