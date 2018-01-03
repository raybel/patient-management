package com.jemai.patient_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jemai.patient_management.model.Patient;
import com.jemai.patient_management.repository.PatientRepository;


@Controller
public class PatientController {
	@Autowired 
	PatientRepository repo ;
	@RequestMapping("/home")
	public String Home ()
	{
		return ("index");
	}
	public List<Patient>findAll()
	{
		return repo.findAll();
	}
	//to finish the rest

}
