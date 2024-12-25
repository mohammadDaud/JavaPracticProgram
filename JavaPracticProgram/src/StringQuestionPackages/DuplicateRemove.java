package StringQuestionPackages;

import java.util.Arrays;

public class DuplicateRemove {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String s = "AAABBBCCC";
		int index = 0;
		String ss = null;
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					break;
				}
			}
			if (j == i) {
				arr[index++] = arr[i];
			}
			ss = s.valueOf(Arrays.copyOf(arr, index));
		}
		System.out.println(ss);
	}

}
