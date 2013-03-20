/* Question.java
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

import org.hibernate.validator.constraints.NotBlank;

public class OpenQuestion extends Question {

	// Constructors -----------------------------------------------------------

	public OpenQuestion() {
		super();
	}

	// Attributes -------------------------------------------------------------

	private String answer;

	@NotBlank
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	// Relationships ----------------------------------------------------------

}
