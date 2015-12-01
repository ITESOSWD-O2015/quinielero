package com.iteso.quinielero.team.midfielders;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class Wingers  extends Player {
	Team team;
	
	public Wingers(Team team, String playerName, Character side) {
		super(team.getNombre(), team.getTeamID());
		this.team = team;
		this.playerName = playerName;
		if(Character.toUpperCase(side)== 'L')
			this.positionAv = "LB";
		else
			this.positionAv = "RB";
	}
	@Override
	public String getPlayers() {
		return team.getPlayers() + "\n" + positionAv+ ": " +playerName;
	}
}
