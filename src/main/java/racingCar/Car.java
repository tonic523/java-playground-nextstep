package racingCar;

public class Car {

	private static final int NAME_SIZE = 5;

	private String name;

	public Car(String name) {
		validateNameSize(name);
		this.name = name;
	}

	private void validateNameSize(String name) {
		if (name.length() > NAME_SIZE) {
			throw new IllegalArgumentException();
		}
	}
}
