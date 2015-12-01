package com.iteso.quinielero.team.midfielders;

import com.iteso.quinielero.team.Player;
import com.iteso.quinielero.team.Team;

public class Playmaker  extends Player {
	Team team;
	
	public Playmaker(Team team, String playerName) {
		super(team.getNombre(), team.getTeamID());
		this.team = team;
		this.playerName = playerName;
		this.positionAv = "AM";
	}
	@Override
	public String getPlayers() {
		return team.getPlayers() + "\n" + positionAv+ ": " +playerName;
	}
}
