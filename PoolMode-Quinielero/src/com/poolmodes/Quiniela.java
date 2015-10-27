package com.poolmodes;

public class Quiniela {

	private String poolmode;
	
void setPoolMode(String mode) {
		
		if(mode==null || mode=="") this.poolmode="ERROR";
		this.poolmode = mode;
	}


String getPoolMode() {
		
	return this.poolmode;
}

}