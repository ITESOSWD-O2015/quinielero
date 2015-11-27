package com.iteso.quinielero.quiniela;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.iteso.quinielero.quiniela.Quiniela;
import com.iteso.quinielero.quiniela.Team;

public class AddQuinielaTeamTest {
	List<Team> existingTeams = new ArrayList<Team>();
	Team team0;// = new Team("Equipo0", 0);
	Team team1; // = new Team("Equipo1", 1);
	Team team2; // = new Team("Equipo2", 2);
	Team team3; // = new Team("Equipo3", 3);
	Team team4; // = new Team("Equipo4", 4);

	@Before
	public void setUp() {
		team0 = mock(Team.class);
		team1 = mock(Team.class);
		team2 = mock(Team.class);
		team3 = mock(Team.class);
		team4 = mock(Team.class);
		existingTeams.add(team0);
		existingTeams.add(team1);
		existingTeams.add(team2);
		existingTeams.add(team3);
		existingTeams.add(team4);
	}

	@Test
	public void testAddOneTeam() {
		Quiniela quiniela = new Quiniela("quiniela");
		when(team2.toString()).thenReturn("Equipo 2");
		quiniela.addTeam(existingTeams.get(2));
		assertEquals("Quiniela de tipo default con los equipos: Equipo 2 ", quiniela.toString());
	}

	@Test
	public void testAddAllTeam() {
		Quiniela quiniela = new Quiniela("quiniela");
		when(team0.toString()).thenReturn("Equipo 0");
		when(team1.toString()).thenReturn("Equipo 1");
		when(team2.toString()).thenReturn("Equipo 2");
		when(team3.toString()).thenReturn("Equipo 3");
		when(team4.toString()).thenReturn("Equipo 4");
		quiniela.addTeam(existingTeams.get(0));
		quiniela.addTeam(existingTeams.get(1));
		quiniela.addTeam(existingTeams.get(2));
		quiniela.addTeam(existingTeams.get(3));
		quiniela.addTeam(existingTeams.get(4));
		assertEquals("Quiniela de tipo default con los equipos: Equipo 0 Equipo 1 Equipo 2 Equipo 3 Equipo 4 ",
				quiniela.toString());
	}
}
