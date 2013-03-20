/* TestAnswer.java
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

import javax.validation.constraints.Min;

public class TestAnswer extends Answer {

	// Constructors -----------------------------------------------------------

	public TestAnswer() {
		super();
	}

	// Attributes -------------------------------------------------------------

	private Integer selected;

	@Min(0)
	public Integer getSelected() {
		return selected;
	}

	public void setSelected(Integer selected) {
		this.selected = selected;
	}

	// Relationships ----------------------------------------------------------

}
