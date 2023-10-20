package assignment10;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private  Double salary;
	
	Employee(){
		
		
	}

	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void accept() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter id");
	id=s.nextInt();
	System.out.println("enter name");
	name=s.next();
	System.out.println("enter salary=");
	salary=s.nextDouble();
	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public void setId(int id2) {
		
		
	}
	
	

}
