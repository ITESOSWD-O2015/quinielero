package com.iteso.quinielero.users.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iteso.quinielero.mysql.DatabaseConnection;
import com.iteso.quinielero.quiniela.iQuiniela;
import com.iteso.quinielero.quiniela.impl.Quiniela;
import com.iteso.quinielero.users.iNotification;
import com.iteso.quinielero.users.iUser;

public class Profile implements iUser {
	String id;
	String username;
	String firstName;
	String lastName;
	String street1;
	String street2;
	String city;
	String state;
	String country;
	String zip;
	String phone;
	String nickname;
	String memberSince;
	ArrayList<iQuiniela> createdQuinielas = new ArrayList<iQuiniela>();
	ArrayList<iQuiniela> activeQuinielas = new ArrayList<iQuiniela>();
	ArrayList<iNotification> notifications = new ArrayList<iNotification>();
	
	public Profile(String id) throws SQLException {
		ResultSet resultSet = null;
		resultSet = DatabaseConnection.queryStatement("SELECT * FROM User WHERE idUser = '" + id + "'");
		
		setId(resultSet.getString("idUser"));
		setFirstName(resultSet.getString("firstName"));
		setLastName(resultSet.getString("lastName"));
		setUsername(resultSet.getString("username"));
		setStreet1(resultSet.getString("street1"));
		setStreet2(resultSet.getString("street2"));
		setCity(resultSet.getString("city"));
		setState(resultSet.getString("state"));
		setCountry(resultSet.getString("country"));
		setZip(resultSet.getString("zip"));
		setPhone(resultSet.getString("phone"));
		setMemberSince(resultSet.getString("membersince"));
		setNickname(resultSet.getString("nickname"));
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getMemberSince() {
		return memberSince;
	}
	public void setMemberSince(String memberSince) {
		this.memberSince = memberSince;
	}
	public ArrayList<iQuiniela> getCreatedQuinielas() {
		return createdQuinielas;
	}
	public void setCreatedQuinielas() {
		iQuiniela quiniela;
		try {
			ResultSet resultSet = DatabaseConnection.queryStatement("SELECT * FROM Quiniela, QuinielaType"
																+ "WHERE Quiniela.idCreator = '" + getId() +"' "
																	+ "AND QuinielaType.idQuinielaType = Quiniela.idQuinielaType");
			do {
				quiniela = new Quiniela(resultSet.getString("name"));
				
				quiniela.setPoolMode(resultSet.getString("name"));  
				quiniela.setStart_date(resultSet.getString("beginDate")); 
				createdQuinielas.add(quiniela);
			} while (resultSet.next());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<iQuiniela> getActiveQuinielas() {
		return activeQuinielas;
	}
	public void setActiveQuinielas() {
		iQuiniela quiniela;
		try {
			ResultSet resultSet = DatabaseConnection.queryStatement("SELECT * FROM Quiniela, UserQuiniela, QuinielaType, League"
																+ "WHERE Quiniela.idquiniela = UserQuiniela.idQuiniela "
																	+ "AND UserQuiniela.idUser = '" + getId() +"' "
																	+ "AND QuinielaType.idQuinielaType = Quiniela.idQuinielaType");
			do {
				quiniela = new Quiniela(resultSet.getString("Quiniela.name"));
				
				quiniela.setPoolMode(resultSet.getString("QuinielaType.name"));  
				quiniela.setStart_date(resultSet.getString("Quiniela.beginDate")); 
				activeQuinielas.add((Quiniela) quiniela);
			} while (resultSet.next());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void update(String notification, String notificationTitle) {
		try {
			DatabaseConnection.updateStatement("INSERT INTO Notification (idUser, title, description) VALUES ('" + getId() + "', '" + notificationTitle + "', '" + notification + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public ArrayList<iNotification> getNotifications() {
		return notifications;
	}
	@Override
	public void setNotifications() {
		iNotification notification;
		try {
			ResultSet resultSet = DatabaseConnection.queryStatement("SELECT * FROM Notification WHERE idUser = '" + getId() + "'");
			do {
				notification = new QuinielaNotification();
				notification.setIdUser(resultSet.getString("iduser"));
				notification.setTitle(resultSet.getString("title"));
				notification.setDescription(resultSet.getString("description"));
				
				notifications.add(notification);
			} while (resultSet.next());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void Id(String id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Username(String username) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void FirstName(String firstName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void LastName(String lastName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Street1(String street1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Street2(String street2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void City(String city) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void State(String state) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Country(String country) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Zip(String zip) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Phone(String phone) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Nickname(String nickname) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void MemberSince(String memberSince) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void CreatedQuinielas(ArrayList<Quiniela> createdQuinielas) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Notifications() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ActiveQuinielas(ArrayList<Quiniela> activeQuinielas) {
		// TODO Auto-generated method stub
		
	}
}
