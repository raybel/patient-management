package com.jemai.patient_management.model;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_cabinet")
public class Cabinet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@OneToMany(targetEntity=Patient.class , mappedBy="cabinet")
	private Collection<Patient>patients;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Collection<Patient> getPatients() {
		return patients;
	}
	public void setPatients(Collection<Patient> patients) {
		this.patients = patients;
	}
	

}
