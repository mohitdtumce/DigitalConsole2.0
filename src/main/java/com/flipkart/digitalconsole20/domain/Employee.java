package com.flipkart.digitalconsole20.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "employee")
public class Employee {
    
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "description")
    private String description;

    protected Employee() {

    }

    public Long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName='" + firstName + ", lastName='" + lastName + ", description='" + description + '}';
    }
}
