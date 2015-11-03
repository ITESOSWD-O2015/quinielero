package com.iteso.quinielero.teams;

public class Team {
	private String nombre = "";
    private int teamID;

    public Team(String nombre, int teamID) {
        this.nombre = nombre;
        this.teamID = teamID;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
