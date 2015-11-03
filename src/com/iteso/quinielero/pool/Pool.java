package com.iteso.quinielero.pool;

import java.util.ArrayList;
import java.util.List;

import com.iteso.quinielero.teams.Team;

public class Pool {
	private String poolmode;

	public void setPoolMode(String mode) {
		if (mode == null || mode == "")
			this.poolmode = "ERROR";
		this.poolmode = mode;
	}

	String getPoolMode() {
		return this.poolmode;
	}
    public List<Team> teams;

    public Pool() {
        setPoolMode("game");
        teams = new ArrayList<Team>();
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    @Override
    public String toString() {
        String teams = "";

        for(Team myTeam : this.teams){
            teams += myTeam.toString() + " ";
        }
        return "Quiniela de tipo " + getPoolMode() +
                " con los equipos: " + teams;
    }
}
