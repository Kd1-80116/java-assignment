package assignmentq4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class Bookmain {

	public static void main(String[] args) {
	
		
		 class BookComparator implements Comparator<Book>{
			 public int compare(Book b1,Book b2) {
				int diff=Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
				 
			 }
		 }
			BookComparator name=new BookComparator();
			
			Set<Book>b= new TreeSet<>(name);
			b.add(new Book("123",20.30,"vinay",2));
			b.add(new Book("213",30.30,"anil",3));
			b.add(new Book("513",40.30,"pupil",4));
			b.add(new Book("345",50.30,"saket",5));
			b.add(new Book("567",70.30,"manas",6));
			b.add(new Book("345",50.30,"vinay",2));
			
			Iterator<Book>itr=b.iterator();
			while(itr.hasNext()) {
			Book ele=itr.next();
			System.out.println(ele);
			
			System.out.print("Iterate in Descending order: ");
			Iterator<Book>d  = ((TreeSet<Book>) b).descendingIterator();
			while(d.hasNext()) {
				Book e = d.next();
				System.out.print(e + ", ");
			}
			
			 
		 }
		

}
}


