/* Announcement.java
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
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Announcement extends DomainEntity {

	// Constructors -----------------------------------------------------------

	public Announcement() {
		super();

		registrations = new HashSet<Registration>();
	}

	// Attributes -------------------------------------------------------------

	private String title;
	private String description;
	private Date moment;

	@NotBlank
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@NotBlank
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	// Relationships ----------------------------------------------------------

	private Exam exam;
	private Reviewer reviewer;
	private Collection<Registration> registrations;

	@NotNull
	@Valid
	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Valid
	public Reviewer getReviewer() {
		return reviewer;
	}

	public void setReviewer(Reviewer reviewer) {
		this.reviewer = reviewer;
	}

	@NotNull
	public Collection<Registration> getRegistrations() {
		return registrations;
	}

	public void setRegistrations(Collection<Registration> registrations) {
		this.registrations = registrations;
	}

	public void addRegistration(Registration registration) {
		registrations.add(registration);
		registration.setAnnouncement(this);
	}

	public void removeRegistration(Registration registration) {
		registrations.remove(registration);
		registration.setAnnouncement(null);
	}

}
