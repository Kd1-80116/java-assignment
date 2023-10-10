/*Q2. Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/

package question_1;

public class Employee {
	private String first_Name;
	private String last_Name;
	private double monthly_Salary;

	public Employee(String first_Name, String last_Name, double monthly_Salary) {
	  this.first_Name = first_Name;
		this.last_Name = last_Name;
		if(this.monthly_Salary >=0) {
			this.monthly_Salary=monthly_Salary;
		}
	}
	

	public String getFirst_Name() {
		return first_Name;
	}


	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}


	public String getLast_Name() {
		return last_Name;
	}


	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}


	public double getMonthly_Salary() {
		return monthly_Salary;
	}


	public void setMonthly_Salary(double monthly_Salary) {
		if(monthly_Salary >=0) {
			this.monthly_Salary=monthly_Salary;
		}
		else
		{
			this.monthly_Salary=0;
		}
	}

};
