package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)	
private long id;
@Column(name="emp_id")
private String EmployeeId;
@Column(name="emp_name")
private String EmployeeName;
@Column(name="emp_age")
private int EmployeeAge;
@Column(name="aadhor")
private Long Aadhor;
@Column(name="department")
private String Department;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(String employeeId) {
	EmployeeId = employeeId;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public int getEmployeeAge() {
	return EmployeeAge;
}
public void setEmployeeAge(int employeeAge) {
	EmployeeAge = employeeAge;
}
public Long getAadhor() {
	return Aadhor;
}
public void setAadhor(Long aadhor) {
	Aadhor = aadhor;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
}
