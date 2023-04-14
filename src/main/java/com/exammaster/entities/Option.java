package com.exammaster.entities;





import org.hibernate.annotations.Type;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Option {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "option_id")
	private Long optionId;

	@Column(name = "option_text")
	private String optionText;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "question_id_fk",nullable= false)
	private Question questionId;

	@Column(name = "is_correct")
//	@Type(type = "org.hibernate.type.BooleanType")
	private Boolean isCorrect;
	 
	public Option() {
		// TODO Auto-generated constructor stub
	}

	public Option(String optionText, Question question, Boolean isCorrect) {
		super();
		this.optionText = optionText;
		this.questionId = question;
		this.isCorrect = isCorrect;
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}

	public Question getQuestion() {
		return questionId;
	}

	public void setQuestion(Question question) {
		this.questionId = question;
	}

	public Boolean getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	@Override
	public String toString() {
		return "Option [optionId=" + optionId + ", optionText=" + optionText + ", question=" + questionId + ", isCorrect="
				+ isCorrect + "]";
	}
	
	

}
