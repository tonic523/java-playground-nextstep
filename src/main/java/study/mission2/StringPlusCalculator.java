package study.mission2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPlusCalculator {
	public static boolean isEmptyStringOrNull(String input) {
		if (input == null) {
			return true;
		}
		return input.isEmpty();
	}

	public static boolean isCustomSplit(String input) {
		Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
		return matcher.find();
	}

	public static void validateIsNumber(String input) throws RuntimeException {
		if (!(input.matches("[+-]?\\d*(\\.\\d+)?"))) {
			throw new RuntimeException();
		}
	}

	public static void validateIsNumbers(String[] input) {
		for (String string : input) {
			validateIsNumber(string);
		}
	}
}
