package racingCar;

public class Application {
	public static void main(String[] args) {

	}

	public static void validateIsNumber(String input) {
		if (!(input.matches("[+]?\\d*(\\.\\d+)?"))) {
			throw new IllegalArgumentException();
		}
	}
}
