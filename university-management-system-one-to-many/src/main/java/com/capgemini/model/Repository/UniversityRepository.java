package com.capgemini.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.capgemini.model.entity.University;
@RestResource
public interface UniversityRepository extends JpaRepository<University, Integer> {
}