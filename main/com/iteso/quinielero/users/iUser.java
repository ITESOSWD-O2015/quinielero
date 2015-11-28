package com.iteso.quinielero.users;

import java.util.ArrayList;

import com.iteso.quinielero.quiniela.impl.Quiniela;

public interface iUser {
	public String getId();
	public void setId(String id);
	public String getUsername();
	public void setUsername(String username);
	public String getFirstName();
	public void setFirstName(String firstName);
	public String getLastName();
	public void setLastName(String lastName);
	public String getStreet1();
	public void setStreet1(String street1);
	public String getStreet2();
	public void setStreet2(String street2);
	public String getCity();
	public void setCity(String city);
	public String getState();
	public void setState(String state);
	public String getCountry();
	public void setCountry(String country);
	public String getZip();
	public void setZip(String zip);
	public String getPhone();
	public void setPhone(String phone);
	public String getNickname();
	public void setNickname(String nickname);
	public String getMemberSince();
	public void setMemberSince(String memberSince);
	public ArrayList<Quiniela> getCreatedQuinielas();
	public void setCreatedQuinielas(ArrayList<Quiniela> createdQuinielas);
	public ArrayList<Quiniela> getActiveQuinielas();
	public void setActiveQuinielas(ArrayList<Quiniela> activeQuinielas);
	public void update(String notification, String notificationTitle);
	
}
