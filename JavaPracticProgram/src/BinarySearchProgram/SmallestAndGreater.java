package BinarySearchProgram;

import java.util.Arrays;

public class SmallestAndGreater {

	public static void main(String[] args) {
		int[] arr = new int[] { 200,1, 2, 8, 4, 5, 6,100,500, 4, 5, 6 };
		Arrays.sort(arr);
		int large, small;
		large = small = arr[0];
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] > large) {
				large = arr[i];
			}
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("large =" + large);
		System.out.println("small =" + small);

		String input = "MohammadDaud";
		for (int i =input.length()-1; i>=0;i-- ) {
			System.out.print(input.charAt(i));
			
		}
		
	}

}
