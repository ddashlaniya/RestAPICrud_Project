package com.crudonapi.CrudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudonapi.CrudOperation.bean.Employee;
import com.crudonapi.CrudOperation.dao.EmployeeDaoOrService;


@RestController
@RequestMapping("/service")
public class EmployeeController {

	EmployeeDaoOrService serviceDao;
	
	public EmployeeController(EmployeeDaoOrService serviceDao) {
		this.serviceDao = serviceDao;
	}
	// Read single employee Data from Database
	@GetMapping("{Id}")
	public Employee getEmployeeData(@PathVariable("Id") int Id) {
    // System.out.println(getEmployeeData(id));
		return this.serviceDao.selectEmployee(Id);
	}
	
	// Read All employee Data From Database
	@GetMapping
	public List<Employee> getAllEmployeeData() {
		System.out.println(this.serviceDao.getAllEmployee());
	return this.serviceDao.getAllEmployee();
	}
	
	// Add employee Data From Database
	@PostMapping
	public String addEmployee(@RequestBody Employee employee) {
		this.serviceDao.addEmployee(employee);
		System.out.println(employee);
		return "Employee Successfully Added";
	}
	
	// Update employee Data From Database
	@PutMapping
	public String updateEmployee(@RequestBody Employee employee) {
		this.serviceDao.updateEmployee(employee);
		System.out.println(employee);
		return "Employee Successfully Updated";
	}
	
	// Delete employee Data From Database
	@DeleteMapping("{Id}")
	public String deleteEmployee(@PathVariable("Id") int Id) {
		if(Id < 0) {
			return "Hey! you wrong";
		}
		this.serviceDao.deleteEmployee(Id);
		//System.out.println(this.serviceDao.selectEmployee(id));
		return "Employee Successfully Deleted";
	}
}
