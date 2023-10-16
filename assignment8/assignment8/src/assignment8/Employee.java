package assignment8;

import java.util.Scanner;

 abstract public class Employee extends Person{
 private int id;
 private double sal;
 
 public void accept() {
	Scanner s=new Scanner(System.in) ;
	System.out.println("enter id=");
	id=s.nextInt();
	System.out.println("enter salary=");
	sal=s.nextDouble();
	 }
 public void display() {
	 System.out.println("id="+id);
	 System.out.println("salary="+sal);
	 
}
 abstract double calculateSalary();
	 
 
 
	

}
