package assignment10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class CollectionMax {

	public static void main(String[] args) {
	List<String>list=new ArrayList<String>();
      list.add("Anil");
      list.add("aniket");
      list.add("prathmesh");
      list.add("rahul");
      ListIterator<String>itr=list.listIterator();
      while(itr.hasNext()) {
    	String e=itr.next() ;
    	System.out.println(e);
    	  
     }
	String maxlength=Collections.max(list,new Comparator<String>() {
		public int compare(String s1,String s2) {
		return Integer.compare(s1.length(),s2.length());
			
		}

		
		
	});
	  System.out.println("string with maximum lenght="+ maxlength);
}
}
