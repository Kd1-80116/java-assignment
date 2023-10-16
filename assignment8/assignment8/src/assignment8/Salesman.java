package assignment8;

import java.util.Scanner;

public class Salesman extends Employee{
private double commi;
public void acceptSalesman() {
	Scanner s=new Scanner(System.in);
	commi=s.nextDouble();
	
}
public void displaySalesman() {
	System.out.println("comm="+commi);
}
@Override
double calculateSalary() {
	// TODO Auto-generated method stub
	return 0;
}

	
	
	

}
