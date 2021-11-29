package racingCar;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private static final String DELIMITER_NAME = ",";

	private List<Car> racingCars = new ArrayList<>();

	public Game(String input) {
		String[] carNames = input.split(DELIMITER_NAME);
		for (String carName : carNames) {
			racingCars.add(new Car(carName));
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
		if ((int)(Math.random() * 2) == 1) {
			return true;
		}
		return false;
	}

	private int getMaxCarPosition() {
		int result = 0;
		for (Car car : racingCars) {
			int position = car.getPosition();
			if (result < position) {
				result = position;
			}
		}
		return result;
	}

	public List<Car> getWinners() {
		List<Car> winners = new ArrayList<>();
		int position = getMaxCarPosition();
		for (Car car : racingCars) {
			if (car.getPosition() == position) {
				winners.add(car);
			}
		}
		return winners;
	}

	public void validateIsNumber(String input) {
		if (!(input.matches("[+]?\\d*(\\.\\d+)?"))) {
			throw new IllegalArgumentException();
		}
	}

	public List<Car> getAllCars() {
		return racingCars;
	}
}
