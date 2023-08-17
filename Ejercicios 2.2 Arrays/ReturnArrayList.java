package ejercicios_arrays;

import java.util.ArrayList;
import java.util.List;

public class ReturnArrayList {
	public List<Integer> determineMultiples(int number, int limit) {

		List<Integer> multiples = new ArrayList<Integer>();

		if (number <= 0 || limit <= 0) {
			return multiples;
		}

		for (int i = 1; number * i < limit; i++) {
			multiples.add(number * i);
		}

		return multiples;
	}
}
