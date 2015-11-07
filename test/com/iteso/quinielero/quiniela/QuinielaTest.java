package com.iteso.quinielero.quiniela;

import static org.junit.Assert.*;

import org.junit.Test;

import com.iteso.quinielero.quiniela.Quiniela;

public class QuinielaTest {
	String name;
	Quiniela quiniela;

	@Test
	public void testQuinielaName() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		assertEquals("quiniela", quiniela.getName());
	}

	@Test
	public void testQuinielaNameError() {
		name = "";
		quiniela = new Quiniela(name);
		assertEquals("ERROR", quiniela.getName());
	}

	@Test
	public void testQuinielaErrorNull() {
		name = null;
		quiniela = new Quiniela(name);
		assertEquals("ERROR", quiniela.getName());
	}

	@Test
	public void setLeague() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setLeague("UEFA");
		assertEquals("UEFA", quiniela.getLeague());
	}

	@Test
	public void testLeagueError() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setLeague("");
		assertEquals("ERROR", quiniela.getLeague());
	}

	@Test
	public void testLeagueNull() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setLeague(null);
		assertEquals("ERROR", quiniela.getLeague());
	}

	@Test
	public void testMaximum() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setMaximum_participants(10);
		assertEquals(10, quiniela.getMaximum_participants());
	}

	@Test
	public void testMaximumErrorExceedLimit() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setMaximum_participants(100);
		assertEquals(-1, quiniela.getMaximum_participants());
	}

	public void testMaximumErrorExceedMinimum() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setMinimum_participants(10);
		quiniela.setMaximum_participants(5);
		assertEquals(-1, quiniela.getMaximum_participants());
	}

	@Test
	public void testMinimum() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setMinimum_participants(10);
		assertEquals(10, quiniela.getMinimum_participants());
	}

	@Test
	public void testMinimumErrorExceedLimit() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setMinimum_participants(100);
		assertEquals(-1, quiniela.getMinimum_participants());
	}

	public void testMinimumErrorExceedMinimum() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setMinimum_participants(10);
		quiniela.setMaximum_participants(5);
		assertEquals(-1, quiniela.getMinimum_participants());
	}

	@Test
	public void testPoolPrice() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setPools_price(6);
		assertEquals(6, quiniela.getPools_price(), 0);
	}

	@Test
	public void testPoolPriceFloat() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setPools_price(6.5);
		assertEquals(6.5, quiniela.getPools_price(), 0);
	}

	@Test
	public void testPoolPriceErrorMinimum() {
		name = "quiniela";
		quiniela = new Quiniela(name);
		quiniela.setPools_price(2);
		assertEquals(-1, quiniela.getPools_price(), 0);

	}
}
