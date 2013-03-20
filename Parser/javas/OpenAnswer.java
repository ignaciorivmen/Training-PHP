/* OpenAnswer.java
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


public class OpenAnswer extends Answer {

	// Constructors -----------------------------------------------------------

	public OpenAnswer() {
		super();
	}

	// Attributes -------------------------------------------------------------

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	// Relationships ----------------------------------------------------------

}
