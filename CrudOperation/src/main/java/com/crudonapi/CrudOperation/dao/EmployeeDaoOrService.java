package com.crudonapi.CrudOperation.dao;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.crudonapi.CrudOperation.bean.Employee;
import com.crudonapi.CrudOperation.exception.NotFoundEmployeeException;
import com.crudonapi.CrudOperation.repository.EmployeeRepository;

@Service
public class EmployeeDaoOrService implements ServiceInterfare {

	EmployeeRepository employeeRepo;

	public EmployeeDaoOrService(EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	@Override
	public String addEmployee(Employee employee) {
		this.employeeRepo.save(employee);
		return "Employee Successfully Added";
	}

	@Override
	public String updateEmployee(Employee employee) {
		this.employeeRepo.save(employee);
		return "Employee Updeted successfully";
	}

	@Override
	public String deleteEmployee(int Id) {
		if(Id < 0) {
			return "Something Goes Wrong";
		}
		this.employeeRepo.deleteById(Id);
		return "Deleted Record";
	}

	@Override
	public Employee selectEmployee(int Id) {
		if(this.employeeRepo.findById(Id).isEmpty()) {
			System.out.println("This Employee Records are not exist");
			throw new NotFoundEmployeeException("This Employee Records are not exist");	
		}
		return this.employeeRepo.findById(Id).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return this.employeeRepo.findAll();
	}


}