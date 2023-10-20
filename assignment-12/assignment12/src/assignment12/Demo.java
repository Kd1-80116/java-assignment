package assignment12;

import java.util.Scanner;

public class Demo {
	public static int menu() {
		int choice;
		System.out.println("********************");
		System.out.println("0.exit");
		System.out.println("1.perform addition=");
		System.out.println("2.perform substraction=");
		System.out.println("3.perform multiplication=");
		System.out.println("4.perform division=");
		System.out.println("enter your choice=");
		choice=new Scanner(System.in).nextInt();
		System.out.println("*******************");
		return choice;
		}
	static void calculate(double num1, double num2, Arithmatic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
	
	}
	
	

	public static void main(String[] args) {
		int choice;
		while(choice =menu()!=0) {
			switch(choice) {
			case 1:
				System.out.println("enter the number=");
				double num1=new scanner(System.in).nextDouble();
				System.out.println("enter the number 2");
				double num2=new scanner(System.in).nextDouble();
				calculate(num1,num2,(x,y)->x+y);
			  break;
			case 2:
				System.out.println("enter the number=");
				double num1=new scanner(System.in).nextDouble();
				System.out.println("enter the number 2");
				double num2=new scanner(System.in).nextDouble();
				calculate(num1,num2,(x,y)->x-y);
			  break;
			case 3:
				System.out.println("enter the number=");
				double num1=new scanner(System.in).nextDouble();
				System.out.println("enter the number 2");
				double num2=new scanner(System.in).nextDouble();
				calculate(num1,num2,(x,y)->x*y);
			  break;
			case 4:
				System.out.println("enter the number=");
				double num1=new scanner(System.in).nextDouble();
				System.out.println("enter the number 2");
				double num2=new scanner(System.in).nextDouble();
				calculate(num1,num2,(x,y)->x/y);
			  break;
			  
			
			
			}
			
			
			
			
			
		}

	}

}
