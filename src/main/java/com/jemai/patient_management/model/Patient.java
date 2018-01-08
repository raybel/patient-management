package com.jemai.patient_management.model;

import java.util.Collection;

import javax.persistence.*;


@Entity
@Table(name="t_patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@ManyToOne(targetEntity=Cabinet.class)
	private Cabinet cabinet ; 
	@OneToOne(targetEntity=Person.class )
	private Person person ;
	@OneToMany(mappedBy="patient" ,targetEntity = Appointment.class , fetch= FetchType.EAGER )
	private Collection<Appointment> appointements;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Collection<Appointment> getAppointements() {
		return appointements;
	}
	public void setAppointements(Collection<Appointment> appointements) {
		this.appointements = appointements;
	}
	
	
	
	
	
	

}
