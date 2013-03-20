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

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class TestQuestion extends Question {

	// Constructors -----------------------------------------------------------

	public TestQuestion() {
		super();
	}

	// Attributes -------------------------------------------------------------

	private Collection<String> answers;
	private int correct;

	@NotEmpty
	@ElementCollection
	public Collection<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Collection<String> answers) {
		this.answers = answers;
	}

	public void addAnswer(String answer) {
		this.answers.add(answer);
	}

	public void removeAnswer(String answer) {
		this.answers.remove(answer);
	}

	@Min(0)
	public int getCorrect() {
		return correct;
	}

	public void setCorrect(int correct) {
		this.correct = correct;
	}

	// Relationships ----------------------------------------------------------

}
