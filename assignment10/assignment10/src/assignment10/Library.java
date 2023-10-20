package assignment10;

import java.util.Scanner;

public class Library {
	private String isbn;
	private double price;
	private String author_name;
	private  int quantity;

	Library(){
		
		
	}
    public Library(String isbn, double price, String author_name, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.author_name = author_name;
		this.quantity = quantity;
	}
    public void accept() {
    Scanner s=new Scanner(System.in);
    System.out.println("enter isbn =");
    isbn=s.next();
    System.out.println("enter price=");
    price=s.nextDouble();
    System.out.println("enter author name");
    author_name=s.next();
    System.out.println("enter quantity");
    quantity=s.nextInt();
   }
    public Boolean equals(object obj) {
    	if(obj == null)
    		return false;
    	if(this == obj)
    		return true;
    	if(obj instanceof Library) {
    	Library other=(Library)obj;
    	if(this.isbn=other.isbn);
    	return true;
    	else
    		return false;
    	
    	}	
    
    	 
    	
    	
    	
    	
    }
    
    
    
    
     @Override
	public String toString() {
		return "Library [isbn=" + isbn + ", price=" + price + ", author_name=" + author_name + ", quantity=" + quantity
				+ "]";
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
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
    
	
}
