package assignment12;

import java.util.Random;
import java.util.stream.Stream;

public class Que7 {

	public static void main(String[] args) {
    Random r=new Random();
    Stream<Integer> str= Stream.generate(() -> r.nextInt(10)).limit(10);
    int result= str.reduce(0, (a,e)-> a+e);
    System.out.println(result);

	}

}
