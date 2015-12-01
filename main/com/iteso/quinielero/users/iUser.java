package com.iteso.quinielero.users;

import java.util.ArrayList;

import com.iteso.quinielero.quiniela.iQuiniela;
import com.iteso.quinielero.quiniela.impl.Quiniela;

public interface iUser {
	public String getId();
	public void Id(String id);
	public String getUsername();
	public void Username(String username);
	public String getFirstName();
	public void FirstName(String firstName);
	public String getLastName();
	public void LastName(String lastName);
	public String getStreet1();
	public void Street1(String street1);
	public String getStreet2();
	public void Street2(String street2);
	public String getCity();
	public void City(String city);
	public String getState();
	public void State(String state);
	public String getCountry();
	public void Country(String country);
	public String getZip();
	public void Zip(String zip);
	public String getPhone();
	public void Phone(String phone);
	public String getNickname();
	public void Nickname(String nickname);
	public String getMemberSince();
	public void MemberSince(String memberSince);
	public ArrayList<iQuiniela> getCreatedQuinielas();
	public void CreatedQuinielas(ArrayList<Quiniela> createdQuinielas);
	public ArrayList<iQuiniela> getActiveQuinielas();
	public ArrayList<iNotification> getNotifications();
	public void Notifications();
	public void ActiveQuinielas(ArrayList<Quiniela> activeQuinielas);
	public void update(String notification, String notificationTitle);
	public void setNotifications();
	
}
