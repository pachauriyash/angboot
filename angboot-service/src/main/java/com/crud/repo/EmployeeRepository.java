package com.crud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findBySalary(double salary);
}
