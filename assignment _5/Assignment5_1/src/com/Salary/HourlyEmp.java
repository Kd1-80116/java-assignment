package com.Salary;

public class HourlyEmp extends Employee {
	private double wages;
	private double hour;
	
  public HourlyEmp(String firstName, String lastName, String ssn, double wages, double hour) {
		super(firstName, lastName, ssn);
		this.wages = wages;
		this.hour = hour;
	}
  public double getWages() {
	return wages;
}
public void setWages(double wages) {
	this.wages = wages;
}
public double getHour() {
	return hour;
}
public void setHour(double hour) {
	this.hour = hour;
}
@Override
	public double earning() {
	if(this.hour<=40) {
		
		return (double)(this.wages*this.hour);
	}
	else
		return (double)(this.wages*40)+((this.hour-40)*wages*1.5);
	
	}
@Override
public String toString() {
	return "HourlyEmp [wages=" + wages + ", hour=" + hour + ", getFirstName()=" + getFirstName() + ", getLastName()="
			+ getLastName() + ", getSsn()=" + getSsn() + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}


}
