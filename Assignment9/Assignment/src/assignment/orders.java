package assignment;

import java.util.Arrays;
import java.util.Comparator;

public class orders {

	public static void main(String[] args) {
		Student[]arr=new Student[4];
		arr[0]=new Student(1,"anil","nanded",20.10);
		arr[1]=new Student(2,"sunil","basmath",30.10);
		arr[2]=new Student(3,"pratik","pune",40.10);
		arr[3]=new Student(4,"mayur","raigad",50.10);
		System.out.println("before sort");
		for(Student k :arr) 
			System.out.println(k);
			Arrays.sort(arr);
			System.out.println("after sort");
			for(Student k :arr)
				System.out.println(k);
			class cityComparator implements Comparator<Student> {
				@Override
				public int compare(Student k1,Student k2) {
					int diff = -k1.getCity().compareTo(k2.getCity());
					return diff;
				}
			}
			
			// sort by city -- Comparator
			cityComparator nameComparator = new cityComparator();
			Arrays.sort(arr, nameComparator);
			System.out.println("After Sort by cityname: ");
			for (Student k : arr)
				System.out.println(k);	
			class markComparator implements Comparator<Student>{
			  @Override
				public int compare(Student k1, Student k2) {
					int diff=-Double.compare(k1.getMarks(),k2.getMarks());
		              return diff;
				}
			}
			  //sort by marks-----comparator
			  markComparator mcomparator=new markComparator();
			  Arrays.sort(arr,mcomparator);
		      System.out.println("after sorting=");
		      for(Student k:arr)
		    	  System.out.println(k);
				
			
	    class nameComparator implements Comparator<Student>{

			@Override
			public int compare(Student k1, Student k2) {
				int diff= k1.getName().compareTo(k2.getName());
				return diff;
			}
	    }
	    nameComparator ncomparator=new nameComparator();
	    Arrays.sort(arr,ncomparator);
	   System.out.println("after sorting");
	   for(Student k:arr)
		   System.out.println(k);
			
		
			
	
	}
		
	}


