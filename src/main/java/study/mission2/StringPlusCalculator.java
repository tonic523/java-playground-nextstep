package study.mission2;

public class StringPlusCalculator {
	public static boolean isEmptyStringOrNull(String input) {
		if (input == null) {
			return true;
		}
		return input.isEmpty();
	}
}
