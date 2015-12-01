package com.iteso.quinielero.quiniela;

import com.iteso.quinielero.users.iUser;

public interface iQuiniela {
	public void registerUser(iUser user);
	public void removeUser(iUser user);
	public void notifyUsers(String notification, String notificationTitle);
	public int getLeagueId();
	public void setPoolMode(String string);
	public void setStart_date(String string);
	public String getName();
	public String getPoolMode();
	public String getStart_date();
}
