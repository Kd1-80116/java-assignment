package com.Salary;

public class Basesalary extends Commission
{
	private double basesalry;

	

	public Basesalary(String firstName, String lastName, String ssn,double grosssales,double commrate, double basesalry) {
		super(firstName, lastName, ssn, grosssales, commrate);
		this.basesalry = basesalry;
	}
	public double getBasesalry() {
		return basesalry;
	}
  public void setBasesalry(double basesalry) {
		this.basesalry = basesalry;
	}

@Override
	public double earning() {
	return (this.basesalry + super.earning());
		
	
	}

}
