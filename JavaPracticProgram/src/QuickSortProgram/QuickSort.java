package QuickSortProgram;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 14, 5, 46, 24, 75, 95, 4, 3, 8, 42, 100 };
		int last = arr.length - 1;
		printValue(arr);
		quickSort(arr, 0, last);
		printValue(arr);
	}

	public static void printValue(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(",");
		}
		System.out.println();
	}

	public static void quickSort(int[] arr, int start, int last) {
		if (start < last) {
			int p = partition(arr, start, last);
			quickSort(arr, start, p - 1);
			quickSort(arr, p + 1, last);
		}
	}

	public static int partition(int[] arr, int start, int last) {
		int pivot = arr[last];
		int i = (start - 1);

		for (int j = start; j <= last - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, last);
		return (i + 1);
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
