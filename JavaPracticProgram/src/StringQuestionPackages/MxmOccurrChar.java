package StringQuestionPackages;

//How to find the maximum occurring character in given String?

public class MxmOccurrChar {

	public static void main(String[] args) {
		String s = "Mohammad daud Basti";
		int charCount = 0;
		char[] arr = s.toCharArray();
		for (char ch : arr) {
			if (ch == 'd') {
				charCount++;
			}
		}
		System.out.println("d Count = " + charCount);
	}

}
