package com.iteso.quinielero.users;

import java.util.ArrayList;

import com.iteso.quinielero.quiniela.Quiniela;

public class Profile {
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
	ArrayList<Quiniela> createdQuinielas = new ArrayList<Quiniela>();
	ArrayList<Quiniela> activeQuinielas = new ArrayList<Quiniela>();
	String password = "1234";
	
	public Profile() {
		super();
	}

	public Profile(String username, String firstName, String lastName) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void addCreatedQuinielas(Quiniela quiniela) {
		createdQuinielas.add(quiniela);
	}

	public void addActiveQuinielas(Quiniela quiniela) {
		activeQuinielas.add(quiniela);
	}

	public ArrayList<Quiniela> getCreatedQuinielas() {
		return createdQuinielas;
	}

	public ArrayList<Quiniela> getActiveQuinielas() {
		return activeQuinielas;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
