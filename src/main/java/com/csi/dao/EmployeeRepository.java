package com.csi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csi.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}