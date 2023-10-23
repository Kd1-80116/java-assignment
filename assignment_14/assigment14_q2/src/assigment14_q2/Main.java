package assigment14_q2;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public void addUser() throws SQLException, Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Frist Name");
		String fName=sc.next();
		System.out.println("Enter User Last Name");
		String lName=sc.next();
		System.out.println("Enter User Email ID");
		String email=sc.next();
		System.out.println("Enter User Password");
		String password=sc.next();
		System.out.println("Enter Date in-(dd-mm-yyyy)");
		String date=sc.next();
		System.out.println("Enter User Staus");
		boolean status=sc.nextBoolean();
		System.out.println("Enter User Role");
		String role=sc.next();
		
		User u=new User(0,fName,lName,email,password,date,status,role);
		
		try(UserDao dao=new UserDao()){
			dao.addUser(u);
		}
	}
	
	public void updateUser() throws SQLException, Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Users ID-Whose data you want to update");
		int id=sc.nextInt();
		System.out.println("Enter User Frist Name");
		String fName=sc.next();
		System.out.println("Enter User Last Name");
		String lName=sc.next();
		System.out.println("Enter User Email ID");
		String email=sc.next();
		System.out.println("Enter User Password");
		String password=sc.next();
		System.out.println("Enter Date in-(dd-mm-yyyy)");
	

	}}
