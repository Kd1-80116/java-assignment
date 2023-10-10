/*Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".*/

package assignment3;

import java.util.Scanner;

public class Calculator {
	 public static void main(String[] args) {
		
  Scanner s=new Scanner(System.in);
   int accountno=1,balence,charges,crdit,crdit_limit;
   
	while(accountno != 0) {
		System.out.println("enter account no =");
		accountno=s.nextInt();
		System.out.println("enter balence");
		 balence=s.nextInt();
		System.out.println("enter charges=");
		charges=s.nextInt();
		System.out.println("enter crdit=");
		crdit=s.nextInt();
		System.out.println("enter crdit_limit");
		crdit_limit=s.nextInt();
		 int newbalence=(balence + charges -crdit);
		 System.out.println("newbalence="+ newbalence);
		 if(newbalence >crdit_limit) {
			 
			 System.out.println("crdit limit excedded");
		 }
		
		
		
		
		
	}
		
	}

}
