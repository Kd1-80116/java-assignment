/*Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. If any book with duplicate
isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem*/

package assignment10;

import java.util.Objects;

public class Books {
	private String isbn;
	private double price;
	private String authorname;
	private int quantity;
	public Books(String isbn, double price, String authorname, int quantity) {
		
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

@Override
public String toString() {
	return "Books [isbn=" + isbn + ", price=" + price + ", authorname=" + authorname + ", quantity=" + quantity + "]";
}
//public int hashcode() {
//	int hash=Objects.hash(this.isbn);
//       return hash;
//	
//}
//public boolean equals(Object obj) {
//	if(obj == null)
//		return false;
//	if(this == obj)
//		return true;
//	if(obj instanceof Books) {
//		Books other = (Books) obj;
//		if(this.isbn== other.isbn)
//			return true;
//	}
//	return false;



@Override
public int hashCode() {
	return Objects.hash(isbn);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Books other = (Books) obj;
	return Objects.equals(isbn, other.isbn);
}


}

