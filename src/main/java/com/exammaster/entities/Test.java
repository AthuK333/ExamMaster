package com.exammaster.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "test_id")
	private Long testId;

	@Column(name = "title")
	private String title;

	@Column(name = "duration")
	private Integer duration;

	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "testId", cascade = CascadeType.ALL)
	private List<Question> questions = new ArrayList<>();

	@OneToMany(mappedBy = "testId", cascade = CascadeType.ALL)
	private List<UserTest> userTests = new ArrayList<>();

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(String title, Integer duration, String description, List<Question> questions,
			List<UserTest> userTests) {
		super();
		this.title = title;
		this.duration = duration;
		this.description = description;
		this.questions = questions;
		this.userTests = userTests;
	}

	public Long getTestId() {
		return testId;
	}

	public void setTestId(Long testId) {
		this.testId = testId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<UserTest> getUserTests() {
		return userTests;
	}

	public void setUserTests(List<UserTest> userTests) {
		this.userTests = userTests;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", title=" + title + ", duration=" + duration + ", description=" + description
				+ ", questions=" + questions + ", userTests=" + userTests + "]";
	}

}
