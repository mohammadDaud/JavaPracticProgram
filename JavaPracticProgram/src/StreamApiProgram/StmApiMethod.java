package StreamApiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StmApiMethod {
	public static void main(String args[]) {

		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);
		
		List<String> names = Arrays.asList("Reflection","Stream","Collection","Method");
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println("filter = "+result);
		
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted = "+show);
		
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
		Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println("map = "+squareSet);
		
		number.stream().map(x -> x * x).forEach(y -> System.out.print("forEachMethod = "+y+" "));
		
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		System.out.println();
		System.out.println("even = "+even);
		
	}
}
