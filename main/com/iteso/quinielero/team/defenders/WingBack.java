package com.iteso.quinielero.team.defenders;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class WingBack  extends Player {
	Team team;
	
	public WingBack(Team team, String playerName, Character side) {
		super(team.getNombre(), team.getTeamID());
		this.team = team;
		this.playerName = playerName;
		if(Character.toUpperCase(side)== 'L')
			this.positionAv = "LWB";
		else
			this.positionAv = "RWB";
	}
	@Override
	public String getPlayers() {
		return team.getPlayers() + "\n" + positionAv+ ": " +playerName;
	}
}
