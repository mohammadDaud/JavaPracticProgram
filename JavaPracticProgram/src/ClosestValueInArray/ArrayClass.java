package ClosestValueInArray;

public class ArrayClass {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 7, 6, 2, 3, 9 };
		int target = 50;
		int idx = 0;
		int dist = Math.abs(arr[0] - target);
		System.out.println("dist = " + dist);
		for (int i = 0; i < arr.length; i++) {
			int cdist = Math.abs(arr[i] - target);
			if (cdist < dist) {
				idx = i;
				dist = cdist;
			}
		}
		System.out.println("closest value odd array = " + arr[idx]);
	}

}
