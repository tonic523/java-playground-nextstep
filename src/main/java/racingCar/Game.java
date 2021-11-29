package racingCar;

public class Game {

	private static final String DELIMITER_NAME = ",";

	private Car[] racingCars;
	private int count;

	public Game(String input) {
		this.racingCars = convertCars(input.split(DELIMITER_NAME));
	}

	private Car[] convertCars(String[] cars) {
		Car[] racingCars = new Car[cars.length];
		for (int i = 0; i < cars.length; i++) {
			racingCars[i] = new Car(cars[i]);
		}
		return racingCars;
	}

	public void play() {
		for (int i = 0; i < count; i++) {
			carsMove();
		}
	}

	public void carsMove() {
		for (Car car : racingCars) {
			if (moveOrStop()) {
				car.move();
			}
		}
	}

	public boolean moveOrStop() {
		if ((int) (Math.random() * 2) == 1) {
			return true;
		}
		return false;
	}

	public void validateIsNumber(String input) {
		if (!(input.matches("[+]?\\d*(\\.\\d+)?"))) {
			throw new IllegalArgumentException();
		}
	}

	public Car[] getAllCars() {
		return racingCars;
	}

	public void setCount(String input) {
		validateIsNumber(input);
		count = Integer.parseInt(input);
	}
}
