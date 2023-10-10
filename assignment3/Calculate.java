/*Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.*/

package assignment3;

import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args) {	
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter total miles per day");
	  float miles=s.nextFloat();
	  System.out.println("enter cost per gasoline=");
	  float cost=s.nextFloat();
	  System.out.println("enter average=");
	  float average=s.nextFloat();
	  System.out.println("enter parking fees=");
	  float fees=s.nextFloat();
	  System.out.println("enter toll=");
	  float toll=s.nextFloat();
	  float usercost=(miles/average)*cost+fees+toll;
	  System.out.println("usercost="+usercost);
			  
	};
	

}
