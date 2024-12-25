package CountDuplicateArrayListElement;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(5);
		lst.add(1);
		lst.add(4);
		lst.add(5);
		lst.add(3);
		lst.add(4);
		lst.add(9);
		lst.add(5);
		lst.add(1);
		lst.add(3);
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(6);
		System.out.println(lst);
		int flag = 0;
		for (int i = 0; i < lst.size(); i++) {
			for (int j = 0; j < lst.size(); j++) {
				if (i != j) {
					if (lst.get(i) != lst.get(j)) {
						flag = 1;
					} else {
						flag = 0;
						break;
					}
				}
			}
			if (flag == 1) {
				System.out.println("Unique Element " + lst.get(i));
			}

		}

	}

}
