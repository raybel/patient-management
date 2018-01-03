package com.jemai.patient_management.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages={"com.jemai.patient_management.repository"})
public class JpaConfig {

}
