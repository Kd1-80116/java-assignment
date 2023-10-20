package assignment10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Booksmain {

	public static void main(String[] args) {
		Set<Books>book= new HashSet<>();
		book.add(new Books("123",20.30,"vinay",2));
		book.add(new Books("213",30.30,"anil",3));
		book.add(new Books("513",40.30,"pupil",4));
		book.add(new Books("345",50.30,"saket",5));
		book.add(new Books("567",70.30,"manas",6));
		book.add(new Books("345",50.30,"vinay",2));
		
		Iterator<Books>itr=book.iterator();
		while(itr.hasNext()) {
		Books ele=itr.next();
		System.out.println(ele);
		}
	}
	

}
//if hashcode not included then random output and take duplicate
//if equal not inluded then take duplicate
//if hashcode and equal method included then avoid duplicate
