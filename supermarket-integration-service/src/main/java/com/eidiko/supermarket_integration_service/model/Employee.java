package com.eidiko.supermarket_integration_service.model;

import java.sql.Date;

public class Employee {

    private int id;
    private String name;
    private String email;
    private String password;
    private String designation;
    private String role;
    private String phoneNumber;
    private Date joiningDate;
    private double salary;
    private int reportingTo;

    public Employee() {
    }

    public Employee(int id, String name, String email, String password, String designation, String role, String phoneNumber, Date joiningDate, double salary, int reportingTo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.designation = designation;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.joiningDate = joiningDate;
        this.salary = salary;
        this.reportingTo = reportingTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getReportingTo() {
        return reportingTo;
    }

    public void setReportingTo(int reportingTo) {
        this.reportingTo = reportingTo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", designation='" + designation + '\'' +
                ", role='" + role + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", joiningDate=" + joiningDate +
                ", salary=" + salary +
                ", reportingTo=" + reportingTo +
                '}';
    }

}
