package com.gl.HibClassAssgmnt.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	private String email;
	private String password;
	private String date;
	@OneToMany
	private List<Question> questions;

	public User() {
	};

	public User(String email, String password, String date) {
		super();
		this.email = email;
		this.password = password;
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", date=" + date + "]";
	}

}
