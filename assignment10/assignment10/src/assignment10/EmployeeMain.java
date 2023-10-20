package assignment10;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		LinkedList<Employee> list1 = new LinkedList<>();
		Employee e;
		 int choice;
		 do { System.out.println("\n1.add employee\n2.delete employee \n3.sort employee\n4.find employee\n5.edit finctionlity\n.enter choice");
			  choice=s.nextInt();
			  switch(choice) {
			  case 1://add employee
				    e=new Employee();
				    e.accept();
				    list1.add(e);
			         break;
			  case 2://delete employee
				     list1.remove(e);
				     break;
				     
			  case 3://sort employee
				  
			         
			  case 4:// find employee
				  System.out.println("enter name of employee u want serach");
			    int id=s.nextInt();
			    Employee key=new Employee();
			    key.setId(id);
			    int index=list1.indexOf(key);
			  if(index == -1) {
				  System.out.println("employee are not present");
			  }
			  else
			  { Employee oldEmp = list1.get(index);
			  System.out.println("Employee Found: " + oldEmp);
			  System.out.println("Enter new information for the Employee");
			  Employee newEmp = new Employee();
			  newEmp.accept();
			  list1.set(index, newEmp);
			  }
			  break;
			  case 5://edit functionlity
			  
			  
			  
			  
			  
			  
			  }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }
	}

}
