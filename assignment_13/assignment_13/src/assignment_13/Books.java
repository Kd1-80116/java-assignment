package assignment_13;

import java.util.Scanner;

public class Books implements Comparable<Books>
	{
	   String isbn;
	   double price;
	   String authorName;
	   int quantity;
	   
	   public Books()
	   {
		   
	   }

	public Books(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}

	public void accept()
	{
	  Scanner sc=new Scanner(System.in);
		
	  System.out.println("Enter isbn no of Book");
	  this.isbn= sc.next();
	  System.out.println("Enter the Price Book");
	  this.price=sc.nextDouble();
	  System.out.println("Enter author name no of Author Name");
	  this.authorName=sc.next();
	  System.out.println("Enter the of books Quantity");
	  this.quantity=sc.nextInt();
	}

	@Override
	public int compareTo1(Books b1) {
		
		int dff=this.isbn.compareTo(b1.getIsbn());
		
		return dff;
	}

	@Override
	public int compareTo(Books arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


	}





