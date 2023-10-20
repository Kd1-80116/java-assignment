package assignment12;

import java.util.Random;
import java.util.stream.Stream;

//Write a program to calculate sum of 10 random integers using streams.
public class Test {

	public static void main(String[] args) {
		Random r=new Random();
		Stream<Integer> str=Stream.generate()->r.nextInt(100).limit(10);
		integer fact=str.reduce(, )

	}

}
