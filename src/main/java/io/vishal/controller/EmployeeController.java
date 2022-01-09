package io.vishal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.vishal.dao.EmployeeRepository;
import io.vishal.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee)
	{
		System.out.println("employee data received:: "+employee);
		employeeRepo.save(employee);
		return "Employye saved successfully";
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployee()
	{
		return employeeRepo.findAll();
	}
	
	@GetMapping("/getEmployee/{dept}")
	public List<Employee> getEmployeesByDepartment(@PathVariable String dept)
	{
		return employeeRepo.findByDept(dept);
	}

}
