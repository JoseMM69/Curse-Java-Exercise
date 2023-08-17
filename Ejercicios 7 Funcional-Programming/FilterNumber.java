package Funcional_Java_Programming;

import java.util.List;
import java.util.stream.Collectors;
public class FilterNumber {
	public static List<Integer> filterOddNumbers(List<Integer> numbers) {
		return numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

	}
}
