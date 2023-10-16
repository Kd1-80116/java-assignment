/*Q1. A company pays its employees on a weekly basis. The employees are of four types:
Salaried employees are paid a fixed weekly salary regardless of the number of hours worked.
Hourly employees are paid by the hour and receive overtime pay (i.e., 1.5 times their hourly salary
rate) for all hours worked in excess of 40 hours.
Commission employees are paid a percentage of their sales.
Base-salaried commission employees receive a base salary plus a percentage of their sales.
For the current pay period, the company has decided to reward salaried-commission employees by
adding 10% to their base salaries. The company wants to write an application that performs its
payroll calculations polymorphically.*/

package com.Salary;

public abstract class Employee {
	private String firstName ;
	private String lastName;
	private String ssn;
	
	public Employee () {
		
	}
	public Employee(String firstName, String lastName, String ssn) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	public abstract double earning();
	

}
