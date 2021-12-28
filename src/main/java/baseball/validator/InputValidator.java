package baseball.validator;

public class InputValidator {
	public static void isNumber(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException();
		}
	}
}
