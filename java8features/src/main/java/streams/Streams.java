package streams;

import java.util.stream.IntStream;

public class Streams {

	public static void main(String[] args) {
	
		int[] arr = {3,2,1,0,8,1};
		int[] arr1 = {3,1,1};
		
		//Find 3 distinct smallest number
		System.out.println("3 distinct smallest number...");
		IntStream.of(arr)
		         .distinct()
		         .sorted()
		         .limit(3)
		         .forEach(System.out :: println);
		
		//Filter Even Numbers
		System.out.println(" Even Numbers...");
		IntStream.of(arr)
		         .filter(num -> num % 2 == 0)      
		         .forEach(System.out :: println);
		
		System.out.println("After doubling each number..");
		IntStream.of(arr)
		         .map(num -> num * 2)
		         .forEach(System.out :: println);
		
		System.out.println("Min = "+IntStream.of(arr).min().getAsInt());
		System.out.println("Max = "+IntStream.of(arr).max().getAsInt());
		System.out.println("Avg = "+IntStream.of(arr).average().getAsDouble());
		         	
	}

}
 