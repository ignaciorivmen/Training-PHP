/* Customer.java
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

import javax.validation.constraints.NotNull;

public class Customer extends Actor {

	// Constructors -----------------------------------------------------------

	public Customer() {
		super();

		registrations = new HashSet<Registration>();
	}

	// Attributes -------------------------------------------------------------

	// Relationships ----------------------------------------------------------

	private Collection<Registration> registrations;

	@NotNull
	public Collection<Registration> getRegistrations() {
		return registrations;
	}

	public void setRegistrations(Collection<Registration> registrations) {
		this.registrations = registrations;
	}

	public void addRegistration(Registration registration) {
		registrations.add(registration);
		registration.setOwner(this);
	}

	public void removeRegistration(Registration registration) {
		registrations.remove(registration);
		registration.setOwner(null);
	}

}
