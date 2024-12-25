package ClosestValueInArray;

import java.util.Arrays;

public class MyClass {

	public static boolean result(int[] a, int[] b) {
		return Arrays.equals(a, b);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 24, 10, 78 };
		int[] arr2 = { 1, 24, 10, 78};
		MyClass m = new MyClass();
		boolean b = m.result(arr, arr2);
		System.out.println(b);
	}
}
