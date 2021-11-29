package racingCar;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		View.carInputUI();
		Game game = new Game(scanner.nextLine());
		View.countInputUI();
		int count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			game.carsMove();
			View.result(game.getAllCars());
		}
		View.winUI(game.getWinners());


	}

	public static void validateIsNumber(String input) {
		if (!(input.matches("[+]?\\d*(\\.\\d+)?"))) {
			throw new IllegalArgumentException();
		}
	}
}
