package assignmentQ2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class Booksmenu {

	public static void main(String[] args) {
		Set<Book>b= new LinkedHashSet<>();
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
		}
	}

	}
//in linkedshset with hash code and equal method order as per given input and duplicate are not allowed

