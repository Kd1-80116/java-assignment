
package com.app.fruit;

import java.util.Scanner;

public class Fruit {
	private String colour;
	private double weight;
	private String name;
	private boolean isfresh=true;
	
	public Fruit(String name){
		this.name = name;
		
	}

//	public Fruit(String colour, double weight, String name, boolean isfresh) {
//		super();
//		this.colour = colour;
//		this.weight = weight;
//		this.name = name;
//		this.isfresh = isfresh;
//	}
	
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIsfresh() {
		return isfresh;
	}

	public void setIsfresh(boolean isfresh) {
		this.isfresh = isfresh;
	}

	@Override
	public String toString() {
		return "Fruit [colour=" + colour + ", weight=" + weight + ", name=" + name + "]";
	}

	public String taste() {
		
		return "no specific taste";
	}
	public void accept() {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter weight=");
	 double weight=s.nextDouble();
	 System.out.println("enter colour=");
	 String colour=s.next();
	 this.colour=colour;
	 this.weight=weight;
	 
		
		
		
		
	}
	
	
	

}
