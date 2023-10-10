import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter num1");
		if (s.hasNextDouble()) {
			double num1 = s.nextDouble();
			System.out.println(num1);
			System.out.println("enter num2");			
			if (s.hasNextDouble()) {
			double num2 = s.nextDouble();
				
				System.out.println(num2);
				System.out.println("avg=" + (num1 + num2) / 2);
			}
			else 
				System.out.println("number is not double type");
			System.exit(0);
		}
		else
			System.out.println("number is not dounble type");
		System.exit(0);
		

	}

}
