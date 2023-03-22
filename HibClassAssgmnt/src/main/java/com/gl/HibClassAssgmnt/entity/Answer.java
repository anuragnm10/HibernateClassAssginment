package com.gl.HibClassAssgmnt.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String answer;
	private String givenbyuser;
	private Date date_added;
	@ManyToOne
	private Question question;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(String answer, String givenbyuser, Date date_added) {
		super();
		this.answer = answer;
		this.givenbyuser = givenbyuser;
		this.date_added = date_added;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getGivenbyuser() {
		return givenbyuser;
	}

	public void setGivenbyuser(String givenbyuser) {
		this.givenbyuser = givenbyuser;
	}

	public Date getDate_added() {
		return date_added;
	}

	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}

	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", answer=" + answer + ", givenbyuser=" + givenbyuser + ", date_added="
				+ date_added + "]";
	}

	
}
