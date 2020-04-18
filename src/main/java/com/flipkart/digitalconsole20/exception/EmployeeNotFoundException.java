package com.flipkart.digitalconsole20.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee id: " + id);
    }
}
