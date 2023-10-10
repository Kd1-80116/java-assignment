/*Q4. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
string form of point's x & y co-ords
Hint : public String getDetails())
Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
both points are having same x,y co-ords or false otherwise.
Add calculateDistance method to calculate distance between current point and specified point &
return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
from user (Scanner) --to create 2 points (p1 & p2)
Use getDetails method to display point details.(p1's details & p2's details)
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
position)
If they are not located at the same position , display distance between p1 & p2*/







package com.app.geometry;

public class point2d {
 
	double x,y;

	public point2d(double x, double y) {
	    this.x = x;
		this.y = y;
	}
	public String getdetail() {
		String a=("x cordinate="+ this.x + "y cordinate="+ this.y);
		 return a;
	}
	public boolean isequal(point2d otherpoint) {
		return ( this.x ==otherpoint.x && this.y == otherpoint.y);
		
	}
	public double calculatedistance(point2d otherpoint) {
	  double X=this.x -otherpoint.x;
	  double Y=this.x-otherpoint.y;
	 return Math.sqrt(Math.pow(x,2)+ Math.pow(y, 2));
		
		
	}
	
	
	
 
 
 
}
