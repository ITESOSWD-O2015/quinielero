package com.iteso.quinielero.servlets.pool;
import static org.junit.Assert.*;
import org.junit.Test;

import com.iteso.quinielero.quiniela.Quiniela;
import com.iteso.quinielero.users.Profile;

public class LeavePoolTest {
	Profile profile;
	Quiniela quiniela;
	 @Test
	    public void testRemoveQuiniela(){
		 //profile = new Profile();
		 quiniela = new Quiniela("quiniela1");
		 //profile.addActiveQuinielas(quiniela);
		 assertTrue(  profile.getActiveQuinielas().remove(quiniela));
	 }
}
