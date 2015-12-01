package com.iteso.quinielero.users.impl;

import com.iteso.quinielero.users.iNotification;

public class QuinielaNotification implements iNotification{
	String idUser;
	String title;
	String description;
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
