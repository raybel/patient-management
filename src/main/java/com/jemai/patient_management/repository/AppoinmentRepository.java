package com.jemai.patient_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jemai.patient_management.model.Appointment;
import java.security.Timestamp;
import java.lang.String;


@Repository
public interface   AppoinmentRepository extends JpaRepository<Appointment, Long> {
 List<Appointment>findByPatient(Long id);
 List<Appointment> findByDate(Timestamp date);
 List<Appointment> findByState(String state);

}
