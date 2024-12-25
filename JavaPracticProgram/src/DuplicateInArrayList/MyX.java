package DuplicateInArrayList;

import java.util.Arrays;
import java.util.List;

public class MyX {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1, 1, 5, 3, 7, 3, 11, 2, 3, 1);
		
		 int a=1;
		 for (int i = 0; i < num.size(); i++) {
		     for (int j = i + 1 ; j < num.size(); j++) {
		          if (num.get(i).equals(num.get(j))) {
		        	  a +=1;
		          }
		     }
		     System.out.println( num.get(i) + " Count "+a);
		     a =1;
		 }
	}

}
