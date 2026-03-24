//package com.capemini.model.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
//import com.capemini.model.entity.Employee;
//
//@RepositoryRestResource
//public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
//	
//		
//	}
//
//}
package com.capgemini.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.capgemini.model.entity.Employee;

@RepositoryRestController
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

