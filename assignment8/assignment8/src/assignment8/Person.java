package assignment8;

import java.util.Scanner;

public class Person {

	private String name;
	private int age;
	public void acceptPerson() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter name of person=");
	name=s.next();
	System.out.println("enter age of person=");
	age=s.nextInt();
}
	public void displayPerson() {
		System.out.println("name="+ name);
		System.out.println(("age="+age));
		}
	
		
	
}
