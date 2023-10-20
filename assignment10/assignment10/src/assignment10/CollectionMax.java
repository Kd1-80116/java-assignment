/*Create a list of strings. Find the string with highest length using Collections.max()*/


package assignment10;

import java.util.*;

public class CollectionMax {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("aniket");
		list.add("bus");
		list.add("cdac");
		list.add("donkeyszebra");
				
System.out.println("max length of element :"+ Collections.max(list));
	
List<Integer>iList=Arrays.asList(6,3,4,7);
Integer max=Collections.max(iList);
System.out.println("maximum value is="+max);

	}
}

