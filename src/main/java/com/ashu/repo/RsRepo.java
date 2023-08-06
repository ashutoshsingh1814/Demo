package com.ashu.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.entity.PatientEntity;

@Repository
public interface RsRepo extends JpaRepository<PatientEntity, Long>{
	
	Optional<PatientEntity> findByMail(String mail);

	
}
