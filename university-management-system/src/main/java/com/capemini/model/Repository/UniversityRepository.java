package com.capemini.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.capemini.model.entity.University;


@RepositoryRestResource
public interface UniversityRepository extends JpaRepository<University, Integer> {
	
}