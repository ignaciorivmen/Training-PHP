/* OpenQuestion.java
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

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Question extends DomainEntity {

	// Constructors -----------------------------------------------------------

	public Question() {
		super();
	}

	// Attributes -------------------------------------------------------------

	private int number;
	private String statement;
	private double maximumMark;

	@Min(0)
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@NotBlank
	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	@Min(0)
	public double getMaximumMark() {
		return maximumMark;
	}

	public void setMaximumMark(double maximumMark) {
		this.maximumMark = maximumMark;
	}

	// Relationships ----------------------------------------------------------

	private Exam exam;

	@NotNull
	@Valid
	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
