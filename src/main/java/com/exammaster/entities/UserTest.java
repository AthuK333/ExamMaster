package com.exammaster.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UserTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_test_id")
	private Long userTestId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "test_id")
	private Test testId;

	@Column(name = "test_date")
	private Date testDate;

	@Column(name = "score")
	private Integer score;
	
	public UserTest() {
		// TODO Auto-generated constructor stub
	}

	public UserTest(User user, Test test, Date testDate, Integer score) {
		super();
		this.user = user;
		this.testId = test;
		this.testDate = testDate;
		this.score = score;
	}

	public Long getUserTestId() {
		return userTestId;
	}

	public void setUserTestId(Long userTestId) {
		this.userTestId = userTestId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Test getTest() {
		return testId;
	}

	public void setTest(Test test) {
		this.testId = test;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "UserTest [userTestId=" + userTestId + ", user=" + user + ", test=" + testId + ", testDate=" + testDate
				+ ", score=" + score + "]";
	}
	
	

}
