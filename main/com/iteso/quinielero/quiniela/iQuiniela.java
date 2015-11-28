package com.iteso.quinielero.quiniela;

import com.iteso.quinielero.users.iUser;

public interface iQuiniela {
	public void registerUser(iUser user);
	public void removeUser(iUser user);
	public void notifyUsers(String notification, String notificationTitle);
}
