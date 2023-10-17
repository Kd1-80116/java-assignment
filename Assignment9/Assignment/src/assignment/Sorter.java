package assignment;

import java.util.Comparator;

public class Sorter {
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		}
	
	
	
	
	
	

	public static void main(String[] args) {
		Double[]arr= {12.30,23.90,30.12,40.59};
		class DoubleComparator implements Comparator<Double>{

			@Override
			public int compareTo(Double d1,Double d2) {
			
			return  Double.compare(d1, d2);
			}

	
}
		DoubleComparator cmp=new DoubleCmparator();
		select.sort(arr,cmp);

}
}
