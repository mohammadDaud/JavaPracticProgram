package BinarySearchProgram;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50, 70, 90, 100 };
		int pivat = 90;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, pivat);
	}

	public static void binarySearch(int[] arr, int first, int last, int pivat) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < pivat) {
				first = mid + 1;
			} else if (arr[mid] == pivat) {
				System.out.println("element found " + (mid+1));
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("element not found");
		}
	}

}
