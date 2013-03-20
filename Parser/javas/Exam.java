/* Exam.java
 *
 * Copyright (C) 2012 Universidad de Sevilla
 * Author (A) 2012 Rafael Corchuelo (corchu@us.es)
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 * 
 */

package domain;

import java.util.Collection;
import java.util.HashSet;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Exam extends DomainEntity {

	// Constructors -----------------------------------------------------------

	public Exam() {
		super();

		questions = new HashSet<Question>();
	}

	// Attributes -------------------------------------------------------------

	private String title;
	private double minimumMark;
	private int minimumScore;

	@NotBlank
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Min(0)
	public double getMinimumMark() {
		return minimumMark;
	}

	public void setMinimumMark(double minimumMark) {
		this.minimumMark = minimumMark;
	}

	@Range(min = 1, max = 99)
	public int getMinimumScore() {
		return minimumScore;
	}

	public void setMinimumScore(int minimumScore) {
		this.minimumScore = minimumScore;
	}

	// Relationships ----------------------------------------------------------

	private Certification certification;
	private Collection<Question> questions;

	@NotNull
	@Valid
	public Certification getCertification() {
		return certification;
	}

	public void setCertification(Certification certification) {
		this.certification = certification;
	}

	@NotEmpty
	public Collection<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Collection<Question> questions) {
		this.questions = questions;
	}

	public void addQuestion(Question question) {
		questions.add(question);
		question.setExam(this);
	}

	public void removeQuestion(Question question) {
		questions.remove(question);
		question.setExam(null);
	}

}
