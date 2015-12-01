package com.iteso.quinielero.quiniela.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iteso.quinielero.mysql.DatabaseConnection;
import com.iteso.quinielero.quiniela.iQuiniela;
import com.iteso.quinielero.team.Team;
import com.iteso.quinielero.users.iUser;
import com.iteso.quinielero.users.impl.Profile;

public class Quiniela implements iQuiniela{

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
	private ArrayList<iUser> pending_people = new ArrayList<iUser>();
	private ArrayList<iUser> participants = new ArrayList<iUser>();
	
	public Quiniela(String name) {
		teams = new ArrayList<Team>();
		setName(name);
	}

	public Quiniela(int leagueid) {
		this.leagueId = leagueid;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public String getStart_date() {
		return start_date;
	}

	public String getPoolMode() {
		return poolmode;
	}

	public String getName() {
		return name;
	}

	public int getMaximum_participants() {
		return maximum_participants;
	}

	public int getMinimum_participants() {
		return minimum_participants;
	}

	public double getPools_price() {
		return pools_price;
	}

	public int getPoolModeId() {
		return poolModeId;
	}

	public int getCreatorId() {
		return creatorId;
	}

	public int getLeagueId() {
		return leagueId;
	}

	public ArrayList<iUser> getPending_people() {
		return pending_people;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setLeagueName(String leagueName) {
		if (leagueName == null || leagueName == "")
			this.leagueName = "ERROR";
		else
			this.leagueName = leagueName;
	}

	public void setMaximum_participants(int maximum_participants) {
		if (maximum_participants > 99 || maximum_participants < 2)
			this.maximum_participants = -1;
		else if (maximum_participants < getMinimum_participants())
			this.minimum_participants = -1;
		else
			this.maximum_participants = maximum_participants;
	}

	public void setMinimum_participants(int minimum_participants) {
		if (maximum_participants < getMinimum_participants())
			this.minimum_participants = -1;
		else if (minimum_participants > 99 || minimum_participants < 2)
			this.minimum_participants = -1;
		else
			this.minimum_participants = minimum_participants;
	}

	public void setName(String name) {
		if (name == "" || name == null)
			this.name = "ERROR";
		else
			this.name = name;
	}

	public void setPoolMode(String mode) {
		if (mode == null || mode == "")
			this.poolmode = "ERROR";
		else
			this.poolmode = mode;
	}

	public void setPools_price(double pools_price) {
		if (pools_price < 5)
			this.pools_price = -1;
		else
			this.pools_price = pools_price;
	}

	public void setStart_date(String sd) {

		start_date = "ERROR";

		if ((Character.isDigit(sd.charAt(0))) && (Character.isDigit(sd.charAt(1))) && (Character.isDigit(sd.charAt(2))) && (Character.isDigit(sd.charAt(3)))
		    && (sd.charAt(4) == '-') && (Character.isDigit(sd.charAt(5))) && (Character.isDigit(sd.charAt(6))) && (sd.charAt(7) == '-') && (Character.isDigit(sd.charAt(8)))
			&& (Character.isDigit(sd.charAt(9)))) start_date = sd;

	}

	public void addTeam(Team team) {
		teams.add(team);
	}

	@Override
	public String toString() {
		String teams = "";

		for (Team myTeam : this.teams) {
			teams += myTeam.toString() + " ";
		}
		return "Quiniela de tipo " + getPoolMode() + " con los equipos: " + teams;
	}

	public void addPending_people(iUser user) {
		pending_people.add(user);
	}

	public void addParticipant(iUser user) {
		participants.add(user);
	}

	public void addParticipanFromPending(iUser user) {
		pending_people.remove(user);
		participants.add(user);
	}

	public void setLeagueId(int leagueId) {
		if (leagueId > 0)
			this.leagueId = leagueId;
		else
			this.leagueId = -1;
	}

	public void setPoolModeId(int poolModeId) {
		if (poolModeId > 0)
			this.poolModeId = poolModeId;
		else
			this.poolModeId = -1;
	}

	public void setCreatorId(int creatorId) {
		if (creatorId > 0)
			this.creatorId = creatorId;
		else
			this.creatorId = -1;
	}

	@Override
	public void registerUser(iUser user) {
		try {
			DatabaseConnection.updateStatement("INSERT INTO UserQuiniela (idQuiniela, idUser) VALUES ('" + this.getLeagueId() + "', '" + user.getId() + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeUser(iUser user) {
		try {
			DatabaseConnection.updateStatement("DELETE FROM UserQuiniela WHERE idQuiniela = '" + this.getLeagueId() + "' AND idUser = '" + user.getId() + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void notifyUsers(String notification, String notificationTitle) {
		for (iUser user : getParticipants()) {
			System.out.println(user.getId() + notification + notificationTitle);
			user.update(notification, notificationTitle);
		}
	}

	public ArrayList<iUser> getParticipants() {
		return participants;
	}

	public void setParticipants() {
		try {
			ResultSet resultSet = DatabaseConnection.queryStatement("SELECT idUser FROM UserQuiniela WHERE idQuiniela = '" + this.getLeagueId() + "'");
			while(resultSet.next()) {
				getParticipants().add(new Profile(resultSet.getString("idUser")));
				System.out.println(getParticipants().size());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
