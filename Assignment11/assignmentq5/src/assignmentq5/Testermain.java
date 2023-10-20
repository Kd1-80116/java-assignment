package assignmentq5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Testermain {

	public static void main(String[] args) {
		Map<String,Book> map = new HashMap<>();
		int choice;
		while((choice = menu()) != 0) 
		{
			Scanner sc = new Scanner(System.in);
		switch (choice)
		{
		case 1:	
			Book b = new Book();
			b.accept();
			map.put(b.getIsbn(), b);
			break;
		
		case 2:
			System.out.println("Enter the key isbm ");
			String isbn = sc.next();
			Book f = map.get(isbn);
			System.out.println(f+",");
			break;
		}
	}
	
}
	
	public static int menu()
	{
		int choice;
		System.out.println("1. Insert into map");
		System.out.println("2. Find in map");
		System.out.print("Enter your choice ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}



	}


