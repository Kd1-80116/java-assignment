package assignment12;

public class Manger implements Emp{
	
	private double salary;
	private double allowances;
	 public Manger(double salary, double allowances) {

		this.salary = salary;
		this.allowances = allowances;
	}
	double calcince() {
		 
		 return (0.2*salary);
	 }
	@Override
	public double getsal() {
		
		return(salary + allowances);
	}
	

}
