package com.jemai.patient_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jemai.patient_management.model.Person;
import java.lang.String;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long > {
Person findByIdentificationNumber(Long identificationNumber);
List<Person> findBySocialSecurityNum(String socialsecuritynum);
List<Person> findByFirstName(String firstname);
List<Person> findByLastName(String lastname);
}
 