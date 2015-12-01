package com.iteso.quinielero.team.midfielders;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class DefendingMidfielder  extends Player {
	Team team;
	
	public DefendingMidfielder(Team team, String playerName) {
		super(team.getNombre(), team.getTeamID());
		this.team = team;
		this.playerName = playerName;
		this.positionAv = "DM";
	}
	@Override
	public String getPlayers() {
		return team.getPlayers() + "\n" + positionAv+ ": " +playerName;
	}
}
