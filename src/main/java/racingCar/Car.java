package racingCar;

public class Car {

	private static final int NAME_SIZE = 5;

	private String name;
	private int position = 0;

	public Car(String name) {
		validateNameSize(name);
		this.name = name;
	}

	private void validateNameSize(String name) {
		if (name.length() > NAME_SIZE) {
			throw new IllegalArgumentException();
		}
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

}
