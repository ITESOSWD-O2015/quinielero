package com.iteso.quinielero.team.defenders;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class FullBack  extends Player {
	Team team;
	
	public FullBack(Team team, String playerName, Character side) {
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
