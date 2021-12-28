package baseball.validator;

public class InputValidator {
	public static void isNumber(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException();
		}
	}

	public static void isOneOrTwo(String request) {
		isNumber(request);
		Integer number = Integer.parseInt(request);
		if (number != 1 && number != 2) {
			throw new IllegalArgumentException();
		}
	}
}
