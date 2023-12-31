package assignmentq5;

import java.util.Scanner;

public class Book implements Comparable<Book> {
		private String isbn;
		private double price;
		private String authorName;
		private int quantity;
		
		public Book() {
			
		}

		public Book(String isbn, double price, String authorName, int quantity) {
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
			return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
					+ "]";
		}
		
		public void accept() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter isbn :");
			this.isbn= sc.next();
			System.out.print("Enter price :");
			this.price=sc.nextDouble();
			System.out.print("Enter Author Name :");
			this.authorName=sc.next();
			System.out.print("Enter Quantity :");
			this.quantity=sc.nextInt();
		}
//		@Override
//		public int hashCode() {
//			int hash =Objects.hash(this.isbn);
//				return hash;
//		}
	//
//		@Override
//		public boolean equals(Object obj) {
//			if (obj == null)
//				return false;
//			if (this == obj)
//				return true;
//			if (obj instanceof Book) {
//				Book other = (Book) obj;
//				if(this.isbn.equals(other.isbn))
//					return true;
//			}
//			return false;
//		}
		
		public int compareTo(Book other) {
			int diff = this.isbn.compareTo(other.isbn);
			return diff;
		}

	}

	


