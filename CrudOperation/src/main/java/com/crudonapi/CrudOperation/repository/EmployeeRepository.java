package com.crudonapi.CrudOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudonapi.CrudOperation.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}
