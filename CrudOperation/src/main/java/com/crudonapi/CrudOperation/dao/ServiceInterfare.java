package com.crudonapi.CrudOperation.dao;

import java.util.List;

import com.crudonapi.CrudOperation.bean.Employee;

public interface ServiceInterfare {

	public String addEmployee(Employee employee);
	public String updateEmployee(Employee employee);
	public String deleteEmployee(int name);
	public Employee selectEmployee(int name);
	public List<Employee> getAllEmployee();
	
}
