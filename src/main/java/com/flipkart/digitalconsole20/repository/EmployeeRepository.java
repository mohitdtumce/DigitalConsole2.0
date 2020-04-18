package com.flipkart.digitalconsole20.repository;

import com.flipkart.digitalconsole20.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
