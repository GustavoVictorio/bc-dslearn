package com.gustavoVictorio.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoVictorio.dslearnbds.entities.Enrollment;
import com.gustavoVictorio.dslearnbds.entities.pk.EnrollmentPK;

public interface EnrollmenteRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
