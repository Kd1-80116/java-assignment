package com.app.geometry;

import java.util.Scanner;

public class Testpoint {

	public static void main(String[] args) {
		System.out.println("enter cordinate for x axis");
		Scanner s=new Scanner(System.in);
		double x=s.nextDouble();
		System.out.println("enter coordinate for y axis");
		double y=s.nextDouble();
	     point2d e1=new point2d(x,y);
		System.out.println("enter coordinate x axis");
		Scanner sc=new Scanner(System.in);
		double X=s.nextDouble();
		System.out.println("enter cordinate y axis");
		double Y=s.nextDouble();
		point2d e2=new point2d(X,Y);
		 String p = e1.getdetail();
		System.out.println(s);
		if(e1.isequal(e2)) {
			System.out.println("two point are equal");
		}
		else
		{
			System.out.println("two point are not equal");
		}
		double distance=e1.calculatedistance(e2);
		System.out.println("distance="+ distance);
		s.close();

	}

}
