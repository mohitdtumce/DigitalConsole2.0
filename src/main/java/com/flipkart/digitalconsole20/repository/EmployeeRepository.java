package com.flipkart.digitalconsole20.repository;

import com.flipkart.digitalconsole20.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
