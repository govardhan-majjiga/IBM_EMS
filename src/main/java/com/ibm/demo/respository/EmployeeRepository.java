package com.ibm.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}


