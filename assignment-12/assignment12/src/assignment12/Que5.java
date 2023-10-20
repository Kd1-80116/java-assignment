package assignment12;

import java.util.Scanner;
import java.util.stream.Stream;

public class Que5 {

	public static void main(String[] args) {
		
		System.out.println("enter number u want to calculate factorial");
		Scanner s=new Scanner(System.in);
		int num=6;
       Stream<Integer> str=Stream.iterate(1,i -> i+1).limit(num);
			
		Integer fact=str.reduce(1,(x,y)-> x*y);
		System.out.println(fact);
	}
}


