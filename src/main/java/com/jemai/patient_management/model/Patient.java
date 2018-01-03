package com.jemai.patient_management.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="t_patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column(name="patient_firstname")
	private  String firstName ;
	@Column(name="patient_secondname")
	private String secondName ;
	@Column(name="patient_dateofbirth")
	private Date dateOfBirth ;
	@Column(name="patient_appointements")
	private ArrayList<Date> appointements;
	@Column(name="patient_age")
	private int age ;
	@Column(name="patient_address")
	private String address ;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public ArrayList<Date> getAppointements() {
		return appointements;
	}
	public void setAppointements(ArrayList<Date>appointements) {
		this.appointements = appointements;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", dateOfBirth="
				+ dateOfBirth + ", appointements=" + appointements + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	

}
