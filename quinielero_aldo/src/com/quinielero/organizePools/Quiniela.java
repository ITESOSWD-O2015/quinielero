package com.quinielero.organizePools;

public class Quiniela {
	
	private String league;
	private String name;
	private int maximum_participants;
	private int minimum_participants;
	private String start_date;
	private double pools_price;
	
	public Quiniela(String name){
		setName(name);		
	}
	String getLeague() {
		return league;
	}

	void setLeague(String league) {
		
		if(league==null || league=="") this.league="ERROR";
		this.league = league;
	}

	int getMaximum_participants() {
		return maximum_participants;
	}
	
	void setParticipants(int minimum_participants, int maximum_participants){		
		if(minimum_participants > maximum_participants){
			setMaximum_participants(-1);
			setMinimum_participants(-1);
		}else if((maximum_participants > 99 || maximum_participants < 2) || (minimum_participants > 99 || minimum_participants < 2)){
			setMinimum_participants(-1);
			setMaximum_participants(-1);
		}else{
			this.maximum_participants = maximum_participants;
			this.minimum_participants = minimum_participants;
		}	
	}

	void setMaximum_participants(int maximum_participants) {	
		this.maximum_participants = maximum_participants;
	}

	int getMinimum_participants() {
		return minimum_participants;
	}

	void setMinimum_participants(int minimum_participants) {	
			this.minimum_participants = minimum_participants;
	}

	String getStart_date() {
		return start_date;
	}

	void setStart_date(String start_date) {
		
		
		this.start_date = start_date;
	}

	double getPools_price() {
		return pools_price;
	}

	void setPools_price(double pools_price) {
		
		if(pools_price < 5) this.pools_price = -1;		
		this.pools_price = pools_price;
	}
	
	
	String getName() {
		return name;
	}
	
	private void setName(String name) {
		if(name == "" || name == null) this.name="ERROR";
		this.name = name;
		
		getName();
	}

	
	
	
	

}
