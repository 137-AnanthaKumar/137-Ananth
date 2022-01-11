package com.employee.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="employee")
public class EmployeeEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long id;
@Column(name="emp_name")
private String EMployeeName;
@Column(name="emp_id")
private String EMployeeId;
@Column(name="emp_sal")
private int EMployeeSalary;
@Column(name="emp_aadhor")
private long EMployeeAadhor;
@Column(name="emp_dept")
private String EMployeeDepartment;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getEMployeeName() {
	return EMployeeName;
}
public void setEMployeeName(String eMployeeName) {
	EMployeeName = eMployeeName;
}
public String getEMployeeId() {
	return EMployeeId;
}
public void setEMployeeId(String eMployeeId) {
	EMployeeId = eMployeeId;
}
public int getEMployeeSalary() {
	return EMployeeSalary;
}
public void setEMployeeSalary(int eMployeeSalary) {
	EMployeeSalary = eMployeeSalary;
}
public long getEMployeeAadhor() {
	return EMployeeAadhor;
}
public void setEMployeeAadhor(long eMployeeAadhor) {
	EMployeeAadhor = eMployeeAadhor;
}
public String getEMployeeDepartment() {
	return EMployeeDepartment;
}
public void setEMployeeDepartment(String eMployeeDepartment) {
	EMployeeDepartment = eMployeeDepartment;
}
}
