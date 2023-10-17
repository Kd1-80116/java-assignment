package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
//mport assignment.Student;



public class menu {

	public static void main(String[] args) {
		List<Libraray>list=new ArrayList<>();
		list.add(new Libraray("1234",40.16,"patil",2));
		list.add(new Libraray("4234",50.16,"anil",3));
		list.add(new Libraray("5234",60.16,"vivek",4));
		list.add(new Libraray("1234",70.16,"ram",5));
		list.add(new Libraray("1234",80.16,"raju",6));
      System.out.println("number of bool in list="+ list.size());
      System.out.println("display library="+list.toString());
      String key="1234";
      if(list.contains(key))
    		  {
    	  System.out.println("isbn are present "+ key);
      }
      else
      {
    	  System.out.println("isbn are absent"+ key);
      }
       key="patil";
         list.remove(key);
         System.out.println(list);
         System.out.println("after delete size of library="+list.size());
         System.out.println("collectiom="+list.toString());
         System.out.println("transverse element");
         for(Libraray k:list)
        	 System.out.println(k);
         System.out.println("\nTraverse collection using Iterator: ");
 		Iterator<Libraray> itr = list.iterator();
 		while(itr.hasNext()) {
 			Libraray k = itr.next();
 			System.out.println(k);
 			list.clear();
 			System.out.println(list);
 			class priceComparator implements Comparator<Libraray>{

 				@Override
 				public int compare(Libraray k1, Libraray k2) {
 					int diff= Double.compare(k1.getPrice(),k2.getPrice() );
 					return diff;
 				}
 		    }
 		    priceComparator ncomparator=new priceComparator();
 		    //list.sort(list,ncomparator);
 		   System.out.println("after sorting");
 		   for(Libraray e:list)
 			   System.out.println();
 		
 			}
 		} 
         
	

	}
}
