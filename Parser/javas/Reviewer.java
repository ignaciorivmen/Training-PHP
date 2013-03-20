/* Reviewer.java
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

import javax.validation.constraints.NotNull;

public class Reviewer extends Actor {

	// Constructors -----------------------------------------------------------

	public Reviewer() {
		super();
	}

	// Attributes -------------------------------------------------------------

	// Relationships ----------------------------------------------------------

	Collection<Announcement> announcements;

	@NotNull
	public Collection<Announcement> getAnnouncements() {
		return announcements;
	}

	public void setAnnouncements(Collection<Announcement> annoucements) {
		this.announcements = annoucements;
	}

	public void addAnnouncement(Announcement announcement) {
		announcements.add(announcement);
		announcement.setReviewer(this);
	}

	public void removeAnnouncement(Announcement announcement) {
		announcements.remove(announcement);
		announcement.setReviewer(null);
	}

}
