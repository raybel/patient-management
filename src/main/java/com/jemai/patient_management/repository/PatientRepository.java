package com.jemai.patient_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jemai.patient_management.model.Patient;



@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
	//add the extra methods to implement here 

}