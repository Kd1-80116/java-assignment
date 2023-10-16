package com.app.fruit;

public class orange extends Fruit{
//	public orange () {
//		setName("orange");
//		setIsfresh(true);
//		}
	public orange()
	{
		super("Orange");
	}
	
	@Override
	public void accept() {
		System.out.println("enter orange detail=");
		super.accept();
	}
	@Override
	public String taste() {
		
		return "sour";
	}
	
	
	
	
	
	

}
