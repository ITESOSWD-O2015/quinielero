package com.iteso.quinielero.quiniela.impl;

import static org.junit.Assert.*;
import org.junit.*;

import com.iteso.quinielero.quiniela.impl.Quiniela;

public class QuinielaTest {
	String name;
	Quiniela quiniela;

	@Before
	public void setUp(){
		name = "quiniela";
		quiniela = new Quiniela(name);
	}	
	
	
	//////////////////////////////////////////////////////
	////////////////////// TEST NAME//////////////////////
	//////////////////////////////////////////////////////
	@Test
	public void testQuinielaName() {
		Quiniela q = new Quiniela(name);
		assertEquals("quiniela", q.getName());
	}
	@Test
	public void testQuinielaNameError() {
		name = "";
		Quiniela q = new Quiniela(name);
		assertEquals("ERROR", q.getName());
	}
	@Test
	public void testQuinielaNameErrorNull() {
		name = null;
		Quiniela q = new Quiniela(name);
		assertEquals("ERROR", q.getName());
	}
	
	
	
	//////////////////////////////////////////////////////
	//////////////// TEST LEAGUE NAME ////////////////////
	//////////////////////////////////////////////////////
	@Test
	public void setLeagueName(){
		quiniela.setLeagueName("UEFA");
		assertEquals("UEFA", quiniela.getLeagueName());
	}
	@Test
	public void setLeagueNameError(){
		quiniela.setLeagueName("");
		assertEquals("ERROR", quiniela.getLeagueName());		
	}
	@Test
	public void setLeagueNameErrorNull(){
		quiniela.setLeagueName(null);
		assertEquals("ERROR", quiniela.getLeagueName());
	}
	

	//////////////////////////////////////////////////////
	////////////////// TEST LEAGUE ID ////////////////////
	//////////////////////////////////////////////////////
	@Test
	public void setLeagueId(){
		quiniela.setLeagueId(2);
		assertEquals(2, quiniela.getLeagueId());
	}
	
	@Test
	public void setLeagueIdError(){
		quiniela.setLeagueId(0);
		assertEquals(-1, quiniela.getLeagueId());		
	}	
	
	

	//////////////////////////////////////////////////////
	////////////// TEST MAXIMUM MEMBERS///////////////////
	//////////////////////////////////////////////////////	
	@Test
	public void testMaximum() {
		quiniela.setMaximum_participants(10);
		assertEquals(10, quiniela.getMaximum_participants());
	}
	@Test
	public void testMaximumErrorExceedLimit() {
		quiniela.setMaximum_participants(100);		
		assertEquals(-1, quiniela.getMaximum_participants());
	}
	public void testMaximumErrorExceedMinimum() {
		quiniela.setMinimum_participants(10);
		quiniela.setMaximum_participants(5);
		assertEquals(-1, quiniela.getMaximum_participants());
	}
	
	

	//////////////////////////////////////////////////////
	////////////// TEST MINIMUM MEMBERS///////////////////
	//////////////////////////////////////////////////////	
	@Test
	public void testMinimum() {
		quiniela.setMinimum_participants(10);
		assertEquals(10, quiniela.getMinimum_participants());
	}
	@Test
	public void testMinimumErrorExceedLimit() {
		quiniela.setMinimum_participants(100);
		assertEquals(-1, quiniela.getMinimum_participants());
	}
	public void testMinimumErrorExceedMinimum() {
		quiniela.setMinimum_participants(10);
		quiniela.setMaximum_participants(5);
		assertEquals(-1, quiniela.getMinimum_participants());
	}
	
	
	//////////////////////////////////////////////////////
	//////////////////TEST POOL PRICE/////////////////////
	//////////////////////////////////////////////////////	
	@Test
	public void testPoolPriceInt() {
		quiniela.setPools_price(6);
		assertEquals(6, quiniela.getPools_price(), 0);
	}
	@Test
	public void testPoolPriceFloat() {
		quiniela.setPools_price(6.5);
		assertEquals(6.5, quiniela.getPools_price(), 0);
	}
	@Test
	public void testPoolPriceErrorMinimum() {
		quiniela.setPools_price(2);
		assertEquals(-1, quiniela.getPools_price(), 0);
	}
	
	
	//////////////////////////////////////////////////////
	///////////////////TEST POOL MODE/////////////////////
	//////////////////////////////////////////////////////	
	@Test
	public void testPoolMode(){
		quiniela.setPoolMode("Jornada");
		assertEquals("Jornada", quiniela.getPoolMode());
	}
	@Test
	public void testPoolModeError(){
		quiniela.setPoolMode("");
		assertEquals("ERROR", quiniela.getPoolMode());
	}
	@Test
	public void testPoolModeErrorNull(){
		quiniela.setPoolMode(null);
		assertEquals("ERROR", quiniela.getPoolMode());
	}
	
	
	
	//////////////////////////////////////////////////////
	//////////////////TEST POOL MODE ID///////////////////
	//////////////////////////////////////////////////////	
	@Test
	public void testPoolModeId(){
		quiniela.setPoolModeId(2);
		assertEquals(2, quiniela.getPoolModeId());
	}
	@Test
	public void testPoolModeIdError(){
		quiniela.setPoolModeId(0);
		assertEquals(-1, quiniela.getPoolModeId());
	}
	
	
	//////////////////////////////////////////////////////
	////////////////////TEST CREATOR ID///////////////////
	//////////////////////////////////////////////////////	
	@Test
	public void testCreatorId(){
		quiniela.setCreatorId(3);
		assertEquals(3, quiniela.getCreatorId());
	}
	@Test
		public void testCreatorIdError(){
		quiniela.setCreatorId(0);
		assertEquals(-1, quiniela.getCreatorId());
	}
	
	//////////////////////////////////////////////////////
	////////////////////TEST START DATE///////////////////
	//////////////////////////////////////////////////////	
	@Test
	public void testStartDate(){
		quiniela.setStart_date("2015-12-12");
		assertEquals("2015-12-12", quiniela.getStart_date());
	}
	@Test
	public void testStartDateError1(){
		quiniela.setStart_date("fecha mal ingresada");
		assertEquals("ERROR", quiniela.getStart_date());
	}
	@Test
	public void testStartDateError(){
		quiniela.setStart_date("12-12-2015");
		assertEquals("ERROR", quiniela.getStart_date());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
