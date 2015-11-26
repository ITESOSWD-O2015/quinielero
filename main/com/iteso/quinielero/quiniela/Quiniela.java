package com.iteso.quinielero.quiniela;

import java.util.ArrayList;
import java.util.List;

import com.iteso.quinielero.users.Profile;

public class Quiniela {
	
	private String start_date;
	private String leagueName;
	private String poolmode;
	private String name;
	private double pools_price;
	private int leagueId;	
	private int poolModeId;	
	private int maximum_participants;
	private int minimum_participants;
	private int creatorId;	
	private List<Team> teams;
	private String type = "";	
	private ArrayList<Profile> pending_people = new ArrayList<Profile>();
	private ArrayList<Profile> participants = new ArrayList<Profile>();

	public Quiniela() { /// UN CONSTRUCTOR
		this.type = "default";
		teams = new ArrayList<Team>();
	}

	public Quiniela(String name) { ///// DOS CONSTRUCTORES???
		setName(name);
	}

	public String getLeagueName(){return leagueName;}
	public String getStart_date(){return start_date;}
	public String getPoolMode(){return poolmode;}
	public String getName(){return name;}
	public String getType(){return type;}	
	public int getMaximum_participants(){return maximum_participants;}
	public int getMinimum_participants(){return minimum_participants;}	
	public double getPools_price(){return pools_price;}	
	public int getPoolModeId(){return poolModeId;}
	public int getCreatorId(){return creatorId;}
	public int getLeagueId(){return leagueId;}
	public ArrayList<Profile> getPending_people() {return pending_people;}	
	public List<Team> getTeams() {return teams;}
	
	
	public void setLeagueName(String leagueName) {
		if (leagueName == null || leagueName == "")
			this.leagueName = "ERROR";
		this.leagueName = leagueName;
	}

	public void setMaximum_participants(int maximum_participants) {

		if (maximum_participants > 99 || maximum_participants < 2)
			this.maximum_participants = -1;
		if (maximum_participants < getMinimum_participants())
			this.minimum_participants = -1;
		this.maximum_participants = maximum_participants;
	}

	public void setMinimum_participants(int minimum_participants) {
		if (maximum_participants < getMinimum_participants())
			this.minimum_participants = -1;
		if (minimum_participants > 99 || minimum_participants < 2)
			this.minimum_participants = -1;
		this.minimum_participants = minimum_participants;
	}

	private void setName(String name) {
		if (name == "" || name == null)
			this.name = "ERROR";
		this.name = name;

		getName();
	}

	public void setPoolMode(String mode) {
		if (mode == null || mode == "")
			this.poolmode = "ERROR";
		this.poolmode = mode;
	}

	public void setPools_price(double pools_price) {

		if (pools_price < 5)
			this.pools_price = -1;
		this.pools_price = pools_price;
	}

	public void setStart_date(String start_date) {

		this.start_date = start_date;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void addTeam(Team team) {teams.add(team);}	

	@Override
	public String toString() {
		String teams = "";

		for (Team myTeam : this.teams) {
			teams += myTeam.toString() + " ";
		}
		return "Quiniela de tipo " + type + " con los equipos: " + teams;
	}

	

	public void addPending_people(Profile profile) {pending_people.add(profile);}	
	public void addParticipant(Profile profile) {participants.add(profile);}
	
	
	public void addParticipanFromPending(Profile profile){
		pending_people.remove(profile);
		participants.add(profile);
	}

	
	public void setLeagueId(int leagueId) {		
		if(leagueId>0)
			this.leagueId = leagueId;
		else
			this.leagueId = -1;
	}

	public void setPoolModeId(int poolModeId) {
		if(poolModeId>0)
			this.poolModeId = poolModeId;
		else
			this.poolModeId = -1;
	}

	

	public void setCreatorId(int creatorId) {
		if(creatorId>0)
			this.creatorId = creatorId;
		else
			this.creatorId = -1;
	}
}
