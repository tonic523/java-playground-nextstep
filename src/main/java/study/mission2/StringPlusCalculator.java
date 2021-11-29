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

	public static String[] getDelimiterExpression(String input) {
		String[] result = {DEFAULT_DELIMITER, input};
		Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
		if (matcher.find()) {
			result[0] = matcher.group(1);
			result[1] = matcher.group(2);
		}
		return result;
	}

	public static void validateIsNumber(String input) throws RuntimeException {
		if (!(input.matches("[+]?\\d*(\\.\\d+)?"))) {
			throw new RuntimeException();
		}
	}

	public static int calculate(String input) {
		int result = 0;
		String[] delimiterExpression = getDelimiterExpression(input);
		String[] numbers = delimiterExpression[1].split(delimiterExpression[0]);
		for (String number : numbers) {
			validateIsNumber(number);
			result += Integer.parseInt(number);
		}
		return result;
	}
}
