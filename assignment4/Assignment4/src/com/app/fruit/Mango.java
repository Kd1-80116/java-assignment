package com.app.fruit;

public class Mango extends Fruit{
//	public Mango() {
//		
//		setName("mango");
//		setIsfresh(true);
//	}
	public Mango()
	{
		super("Mango");
		
	}
	@Override
	public void accept() {
		
		System.out.println("enter detail of Mango");
		super.accept();
	}
	@Override
	public String taste() {
		
		return "sweet";
	}
	
	
	
	
	

}
