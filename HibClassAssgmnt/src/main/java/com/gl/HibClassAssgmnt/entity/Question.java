package com.gl.HibClassAssgmnt.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String ques;
	private String askedBy;
	@OneToMany(mappedBy = "question")
	private List<Answer> ans;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(String ques, String askedBy, List<Answer> ans) {
		super();
		this.ques = ques;
		this.askedBy = askedBy;
		this.ans = ans;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public String getAskedBy() {
		return askedBy;
	}

	public void setAskedBy(String askedBy) {
		this.askedBy = askedBy;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", ques=" + ques + ", askedBy=" + askedBy + ", ans=" + ans + "]";
	}

}
