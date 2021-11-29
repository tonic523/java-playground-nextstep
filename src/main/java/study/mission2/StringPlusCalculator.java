package study.mission2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPlusCalculator {

	private static final String DEFAULT_DELIMITER = ",|:";

	public static boolean isEmptyStringOrNull(String input) {
		if (input == null) {
			return true;
		}
		return input.isEmpty();
	}

	public static String getDelimiter(String input) {
		Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
		if (matcher.find()) {
			return matcher.group(1);
		}
		return DEFAULT_DELIMITER;
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
