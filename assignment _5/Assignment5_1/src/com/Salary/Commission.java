package com.Salary;

public class Commission extends Employee
{
	private double grosssales;
	private double commrate;
	
public Commission(String firstName, String lastName, String ssn, double grosssales, double commrate) {
		super(firstName, lastName, ssn);
		this.grosssales = grosssales;
		this.commrate = commrate;
	}

public double getGrosssales() {
	return grosssales;
}
public void setGrosssales(double grosssales) {
	this.grosssales = grosssales;
}
public double getCommrate() {
	return commrate;
}
public void setCommrate(double commrate) {
	this.commrate = commrate;
}
@Override
	public double earning() {
		return (double)(this.commrate*this.grosssales/100);
		
	}

@Override
public String toString() {
	return "Commission [grosssales=" + grosssales + ", commrate=" + commrate + ", getFirstName()=" + getFirstName()
			+ ", getLastName()=" + getLastName() + ", getSsn()=" + getSsn() + ", toString()=" + super.toString()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}







}
