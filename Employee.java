package com.example.employeemanagement.entities;
import javax.persistence.*;
@Entity
@Table(name= "Employee")
public class Employee {
	@Id
	@Column(name= "EmployeeId" )
	private String empid;
	@Column(name= "Employee_Name" )
	private String empname;
	@Column(name= "Salary" )
	private float salary;
	@Column(name= "Age" )
	private int age;
	
	/*---Default Constructor---*/
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*---Parameterized Constructor--*/ 
	public Employee(String empid, String empname, float salary, int age) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.age = age;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	

}
