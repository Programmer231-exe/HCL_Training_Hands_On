package org.hibernatedemo.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderWithEmbeddedContact {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	Long id;
	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "name",column = @Column(name = "holidayname")),
		@AttributeOverride(name = "address",column = @Column(name = "holidayAddress")),
		@AttributeOverride(name = "phone",column = @Column(name = "holidayPhone"))
	})
	EmbeddedContact holidayContact;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "name",column = @Column(name = "weekdayname")),
		@AttributeOverride(name = "address",column = @Column(name = "weekdayaddress")),
		@AttributeOverride(name = "phone",column = @Column(name = "weekdayphone"))
	})
	EmbeddedContact weekdayContact;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EmbeddedContact getHolidayContact() {
		return holidayContact;
	}

	public void setHolidayContact(EmbeddedContact holidayContact) {
		this.holidayContact = holidayContact;
	}

	public EmbeddedContact getWeekdayContact() {
		return weekdayContact;
	}

	public void setWeekdayContact(EmbeddedContact weekdayContact) {
		this.weekdayContact = weekdayContact;
	}
	
}
