package com.app.fruit;



public class Apples extends Fruit 
{
//	public Apples(String colour,double weight,String name,boolean isfresh)
//	
//	{
//		super(colour,weight,name,isfresh);
//		
//	}
	public Apples() {
		// TODO Auto-generated constructor stub
		super("Apple");
	}

	@Override
	public void accept() {
		
		System.out.println("enter detail of apple");
		super.accept();
	}
	@Override
	public String taste() {
		
		return "sweet and sour";
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	

}
