package collection;

public class Libraray {
	private String isbn;
	private double price;
	private String authorname;
	private int quantity;
	public Libraray(String isbn, double price, String authorname, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorname = authorname;
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
public String getAuthorname() {
		return authorname;
	}
public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
public int getQuantity() {
		return quantity;
	}
public void setQuantity(int quantity) {
		this.quantity = quantity;
	
	}

}
