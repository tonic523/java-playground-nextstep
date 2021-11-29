package racingCar;

import java.util.Map;

public class Game {

	private static final String DELIMITER_NAME = ",";

	private Car[] racingCars;

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

	public Car[] getAllCars() {
		return racingCars;
	}
}
