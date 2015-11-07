package com.iteso.quinielero.quiniela;

import java.util.ArrayList;
import java.util.List;

import com.iteso.quinielero.users.Profile;

public class Quiniela {
	private String league;

	private int maximum_participants;

	private int minimum_participants;

	private String name;

	private String poolmode;

	private double pools_price;

	private String start_date;

	public List<Team> teams;

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

	public void addTeam(Team team) {
		teams.add(team);
	}
	public String getLeague() {
		return league;
	}
	public int getMaximum_participants() {
		return maximum_participants;
	}
	public int getMinimum_participants() {
		return minimum_participants;
	}
	public String getName() {
		return name;
	}
	public String getPoolMode() {
		return this.poolmode;
	}

	public double getPools_price() {
		return pools_price;
	}

	public String getStart_date() {
		return start_date;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public String getType() {
		return type;
	}

	public void setLeague(String league) {

		if (league == null || league == "")
			this.league = "ERROR";
		this.league = league;
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

	@Override
	public String toString() {
		String teams = "";

		for (Team myTeam : this.teams) {
			teams += myTeam.toString() + " ";
		}
		return "Quiniela de tipo " + type + " con los equipos: " + teams;
	}

	public ArrayList<Profile> getPending_people() {
		return pending_people;
	}

	public void addPending_people(Profile profile) {
		pending_people.add(profile);
	}
	
	public void addParticipant(Profile profile) {
		participants.add(profile);
	}
	
	public void addParticipanFromPending(Profile profile){
		pending_people.remove(profile);
		participants.add(profile);
	}
}
