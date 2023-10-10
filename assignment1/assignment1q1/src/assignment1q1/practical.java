package assignment1q1;

import java.util.Scanner;

public class practical {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println( "enter number");
	int num=s.nextInt();
	String by=Integer.toBinaryString(num);
	System.out.println("binary=" + by);
	String oct=Integer.toOctalString(num);
	System.out.println("octal="+ oct);
	String hexa=Integer.toHexString(num);
	System.out.println("hexa=" + hexa);
	
				

	}

}
