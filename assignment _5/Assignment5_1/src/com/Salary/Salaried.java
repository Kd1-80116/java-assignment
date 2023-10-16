package com.Salary;

public class Salaried extends Employee{

	private double weeksalary;
	
public Salaried(String firstName, String lastName, String ssn, double weeksalary) {
		super(firstName, lastName, ssn);
		this.weeksalary = weeksalary;
	}
public double getWeeksalary() {
	return weeksalary;
}
public void setWeeksalary(double weeksalary) {
	this.weeksalary = weeksalary;
}
@Override
	public double earning() {
		return this.weeksalary;
	}
@Override
public String toString() {
	return "Salaried [weeksalary=" + weeksalary + ", getFirstName()=" + getFirstName() + ", getLastName()="
			+ getLastName() + ", getSsn()=" + getSsn() + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}

	
	
	
	
	

}
