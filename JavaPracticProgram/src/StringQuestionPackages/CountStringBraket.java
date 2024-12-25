package StringQuestionPackages;

public class CountStringBraket {

	public static void main(String[] args) {
		String str = ")))))(((((()(()()()((";
		char[] arr = str.toCharArray();
		System.out.println(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				if ((i + 1) < arr.length) {
					if (arr[i + 1] == ')') {
						continue;
					} else {
						System.out.print(arr[i]);
						count++;
					}
				}
			}
			else {
				System.out.print(arr[i]);
				count++;
			}
			
		}
		System.out.println("incompleted = " + count);

	}

}
