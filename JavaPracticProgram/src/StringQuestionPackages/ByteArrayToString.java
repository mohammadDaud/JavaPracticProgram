package StringQuestionPackages;

import java.io.File;
import java.io.FileInputStream;

//How to convert a byte array to String?
public class ByteArrayToString {

	public static void main(String[] args) {
		File file = new File("D:\\inputFile.txt");
		try {
			FileInputStream fl = new FileInputStream(file);
			byte[] brr = new byte[(int) file.length()];
			fl.read(brr);
			fl.close();
			String s = new String(brr, "UTF-8");
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
