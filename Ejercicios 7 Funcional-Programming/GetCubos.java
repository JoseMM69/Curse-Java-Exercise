package Funcional_Java_Programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetCubos {
	public static List<Integer> getCubesOfFirstNNumbers(int n) {
		return IntStream.range(1, n + 1).map(number -> number * number * number).boxed().collect(Collectors.toList());
	}
}
