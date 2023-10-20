package assignment12;

import java.util.stream.IntStream;

public class Que8 {



	public static void main(String[] args) {
		IntStream strm1= IntStream.range(1,10 );
        int sum= strm1.sum();
         System.out.println(sum);
         
         IntStream strm2= IntStream.range(1, 10);
          System.out.println(strm2.summaryStatistics());

	}

}