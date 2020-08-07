 package com.susan.springbootemployeesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.susan.springbootemployeesystem.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
