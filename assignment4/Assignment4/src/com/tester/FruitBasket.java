package com.tester;

import java.util.Scanner;

import com.app.fruit.*;


public class FruitBasket {
public static int menu()
			{
				
				System.out.println("1.Add Mango");
				System.out.println("2.Add Orange");
				System.out.println("3.Add Apple");
				System.out.println("4.Display names of all fruits in the basket");
				System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
		        System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
				System.out.println("7. Mark a fruit as stale");
				System.out.println("8. Mark all sour fruits stale (optional)");
				System.out.println("0.EXIT");
				int choise;
				choise=new Scanner(System.in).nextInt();
				return choise;
			}

			public static void main(String args[]) {
				
				Scanner sc=new Scanner(System.in);
//				Fruits fruits=new Fruits();
//				Apple apple=new Apple();
//				Mango mango=new Mango();
//				Orange orange=new Orange();
				
				System.out.println("Enter the Size Of Basket");
				int size=sc.nextInt();
				
				Fruit FruitBasket[]=new Fruit[size];
			    int counter=0;
				
				
				int choise;
				while((choise=menu())!=0)
				{
					
					switch (choise) 
					{
					case 1:
						if(counter<size)
						{
						Fruit  mango=new Mango();
						mango.accept();
						FruitBasket[counter]=mango;
						counter++;
						}
						else
		            	{
		            		System.out.println("The basket is filled compltely");
		            	}
						break;
						
						
						
						
		            case 2:
		            	if(counter<size)
						{
						Fruit orange=new orange();
						orange.accept();
						FruitBasket[counter]=orange;
						counter++;
						}
		            	else
		            	{
		            		System.out.println("The basket is filled compltely");
		            	}
						break;
		           
						
						
		            case 3:
		            	if(counter<size)
						{
						Fruit apple=new Apples();
						apple.accept();
						FruitBasket[counter]=apple;
						counter++;
						}
		            	else
		            	{
		            		System.out.println("The basket is filled compltely");
		            	}
						
						break;
		            
						
						
		            case 4://Display names of all fruits in the basket
						for(Fruit fruit:FruitBasket)
						{
							System.out.println("The name is : "+fruit.getName());
						}
						break;

						
						
		            case 5://Display name,color,weight , taste of all fresh fruits , in the basket
		            	for(Fruit fruits:FruitBasket)
						{
		            		if(fruits.isFresh())
		            		{
		            			System.out.println(fruits.toString()+" Taste = "+fruits.taste());
		            		}
							
						}
						break;
		            
						
						
						
		            case 6://6. Display tastes of all stale(not fresh) fruits in the basket
		            	for(Fruit fruit:FruitBasket)
						{
		            		if(!fruit.isFresh())
		            		{
		            			System.out.println(fruit.toString()+" Taste = "+fruit.taste());
		            		}
							
						}
						break;
		           
						
						
						
		            case 7:// Mark a fruit as stale
		            	for(Fruit fruits:FruitBasket)
						{
		            		if(fruits.isFresh())
		            		{
		            		System.out.println(fruits.toString()+" Taste = "+fruits.taste());
		            		System.out.println("Are you want to mark this fruit to Stale");
		            		System.out.println("1-YES,0-NO)");
		            		int a=sc.nextInt();
		            		if(a==1)
		            		{
		            			fruits.setFresh(false);
		            			System.out.println("Successfully Mark as a Stale");
		            		}
		            		}
		            		
						}
						
						break;
		            
		            
						
						
						
		            case 8://Mark all sour fruits stale (optional)
		            	String s;
		            	for(Fruit fruits:FruitBasket)
						{
		            		if((s=fruits.taste())=="sour")
		            		{
		            			fruits.setFresh(false);
		            			System.out.println("Successfully Mark as a Stale");
		            		}
							
						}
						
						break;
		           
					}
					System.out.println("*************************************************************");
					
					//choise=menu();
					
					
					
				}

			}

		
}
		
		
		
		
		
		
		
		
	

}
