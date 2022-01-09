package io.vishal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.vishal.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByDept(String dept);

}
