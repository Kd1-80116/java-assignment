package com.tester;

import java.util.Scanner;
import com.Salary.*;

public class Test 
{

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Employee []earr=new Employee[6];
	System.out.println("1.salary employe=");
	System.out.println("2.add commission emp=");
	System.out.println("3. hourlyemp=");
	System.out.println("4.basesalary emp");
	System.out.println("5.adding 10% to basic salry=");
	System.out.println("6.display detail of employee");
	System.out.println("7.exit");
	
	String firstName =null; ;
	 String lastName=null;
	 String ssn=null;
	 double wages=0.0;
	 double hour=0.0;
	 double grosssales=0.0;
	 double commrate=0.0;
	 double weeklysalary=0.0;
	 double basesalry=0.0;
	 
	 int count=0;
	 int choice=0;
	 do {
		 System.out.println("enter ur choice");
		 choice=s.nextInt();
		 switch(choice) {
		 
		 case 1:System.out.println("enter first name=");
		 firstName=s.next();
		 System.out.println("enter last name=");
		 lastName=s.next();
		 System.out.println("enter ssn=");
		 ssn=s.next();
		 System.out.println("enter weekly salary");
		 double weeksalary=s.nextDouble();
		 earr[count++]=new Salaried(firstName,lastName,ssn,weeklysalary);
		 break;
		 case 2:
			 System.out.println("enter first name");
			 firstName=s.next();
			 System.out.println("enter last name=");
			 lastName=s.next();
			 System.out.println("enter ssn=");
			 ssn=s.next();
			System.out.println("enter grosssale=");
		    grosssales=s.nextDouble();
		    System.out.println("enter commrates=");
		    commrate=s.nextDouble();
		   earr[count++]=new Commission(firstName,lastName,ssn,grosssales,commrate);
		    break;
		 case 3:
			 System.out.println("enter first name");
			 firstName=s.next();
			 System.out.println("enter last name=");
			 lastName=s.next();
			 System.out.println("enter ssn=");
			 ssn=s.next();
			 System.out.println("enter wages=");
			 wages=s.nextDouble();
			 System.out.println("enter hour=");
			 hour=s.nextDouble();
			 earr[count++]=new HourlyEmp(firstName,lastName,ssn,wages,hour);
			 break;
		 case 4:
			 System.out.println("enter first name");
			 firstName=s.next();
			 System.out.println("enter last name=");
			 lastName=s.next();
			 System.out.println("enter ssn=");
			 ssn=s.next();
			 System.out.println("enter base salary=");
			 basesalry=s.nextDouble();
			 System.out.println("enter grosssale=");
			    grosssales=s.nextDouble();
			    System.out.println("enter commrates=");
			    commrate=s.nextDouble();
			 
			 earr[count++]=new Basesalary(firstName,lastName,ssn,basesalry,grosssales,commrate);
			 break;
			 
		 case 5:
			 int tcount=0;
			 for(Employee e : earr) {
				 if( e != null) {
					 
					 if(e instanceof Basesalary) {
				Basesalary r=(Basesalary)e;
				r.setBasesalry(1.1 * r.getBasesalry());
				tcount ++;
			}
				 }
			 }
			 if(tcount == 0) {
				 
				 System.out.println("no basesalry commssion employe present");
				 }
			 else
			 {
				 System.out.println("10% base commssion employe present=");
			 }
			 
		 case 6:
			 for(Employee e:earr)
		 {
			 if( e!= null) {
				 System.out.println(e);
				 System.out.println(e.earning());
				 System.out.println();
				 }
			}
		 break;
		 
		 default: 
			 System.out.println("enter correct option=");
		 }
		 }while (choice !=7);
		 s.close();
	
	
		 
	 }
	}


			 
			 
			 
		    
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 






