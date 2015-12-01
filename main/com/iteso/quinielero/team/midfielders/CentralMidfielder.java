package com.iteso.quinielero.team.midfielders;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class CentralMidfielder  extends Player {
	Team team;
	
	public CentralMidfielder(Team team, String playerName) {
		super(team.getNombre(), team.getTeamID());
		this.team = team;
		this.playerName = playerName;
		this.positionAv = "CM";
	}
	@Override
	public String getPlayers() {
		return team.getPlayers() + "\n" + positionAv+ ": " +playerName;
	}
}
