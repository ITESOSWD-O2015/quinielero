package com.iteso.quinielero.team;

public abstract class Player extends Team{
	public String positionAv;
	public String playerName;

	public Player(String nombre, int teamID) {
		super(nombre, teamID);
		// TODO Auto-generated constructor stub
	}

	public abstract String getPlayers();
}
