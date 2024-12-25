package StreamApiProgram;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 4;
		boolean b = IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
		if (b) {
			System.out.println("Prime Number " + number);
		} else {
			System.out.println("Not prime Number " + number);
		}
		
//		int number = 2;
//		System.out.println(isPrime(number));
	}

	
//	public static boolean isPrime(int number) {
//	    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
//	}
}
