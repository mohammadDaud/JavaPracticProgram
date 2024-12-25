package flatMapExmpale;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFlatMap {
	public static void main(String[] args) {
		List<List<String>> number = Arrays.asList(Arrays.asList("daud"), 
												  Arrays.asList("ghfh"),
												  Arrays.asList("lkjkhkjh"), 
												  Arrays.asList("adafghrty"));

		System.out.println("List of list-" + number);
		List<String> maplst=number.stream().map(list ->list.get(0)).collect(Collectors.toList());
		System.out.println(maplst);
		List<String> flatmapList = number.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(flatmapList);
		List<String> flatList = number.stream().flatMap(list -> list.stream()).sorted((a, b) -> {
			return a.compareTo(b);
		}).collect(Collectors.toList());

		System.out.println("List generate by flatMap-" + flatList);
	}
}
