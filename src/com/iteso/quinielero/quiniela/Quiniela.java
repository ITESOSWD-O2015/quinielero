package com.iteso.quinielero.quiniela;

import java.util.ArrayList;
import java.util.List;

public class Quiniela {
	private String poolmode;

	public void setPoolMode(String mode) {
		if (mode == null || mode == "")
			this.poolmode = "ERROR";
		this.poolmode = mode;
	}

	String getPoolMode() {
		return this.poolmode;
	}
	private String type = "";

    public List<Team> teams;

    public Quiniela() {
        this.type = "default";
        teams = new ArrayList<Team>();
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "Quiniela de tipo " + type +
                " con los equipos: " + teams;
    }

	private String league;
	private String name;
	private int maximum_participants;
	private int minimum_participants;
	private String start_date;
	private double pools_price;
	
	public Quiniela(String name){
		setName(name);		
	}
	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		
		if(league==null || league=="") this.league="ERROR";
		this.league = league;
	}

	public int getMaximum_participants() {
		return maximum_participants;
	}

	public void setMaximum_participants(int maximum_participants) {
		
		if(maximum_participants > 99 || maximum_participants < 2) this.maximum_participants = -1;
		if(maximum_participants < getMinimum_participants()) this.minimum_participants = -1;
		this.maximum_participants = maximum_participants;
	}

	public int getMinimum_participants() {
		return minimum_participants;
	}

	public void setMinimum_participants(int minimum_participants) {
		if(maximum_participants < getMinimum_participants()) this.minimum_participants = -1;	
		if(minimum_participants > 99 || minimum_participants < 2) this.minimum_participants = -1;
		this.minimum_participants = minimum_participants;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		
		
		this.start_date = start_date;
	}

	public double getPools_price() {
		return pools_price;
	}

	public void setPools_price(double pools_price) {
		
		if(pools_price < 5) this.pools_price = -1;		
		this.pools_price = pools_price;
	}
	
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		if(name == "" || name == null) this.name="ERROR";
		this.name = name;
		
		getName();
	}

	
}
