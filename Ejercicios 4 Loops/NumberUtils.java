package loops_java;

public class NumberUtils {
	public int getLastDigit(int number) {
		// Write your code here
		if (number < 0) {
			return -1;
		}
		return number % 10;
	}
}
