package assignment8;

import java.util.Scanner;

public class Manger extends Employee {

	private double bonus;
	
	
	public Manger() 
	{
	}
	
	public void acceptManger() {
		super.accept();
		Scanner s=new Scanner(System.in);
		bonus=s.nextDouble();
		}
	public void displayManger() {
		super.display();
		
		System.out.println("bonus="+ bonus);
	}
	@Override
	double calculateSalary() {
		return this.bonus + this.
	
	}

}
