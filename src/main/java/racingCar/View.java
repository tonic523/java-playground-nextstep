package racingCar;

import java.util.List;

public class View {

	public static void carInputUI() {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
	}

	public static void countInputUI() {
		System.out.println("시도할 회수는 몇회인가요?");
	}

	public static void result(List<Car> cars) {
		for (Car car : cars) {
			String position = new String(new char[car.getPosition()]).replace("\0", "-");
			System.out.println(car + " : " + position);
		}
		System.out.println();
	}

	public static void winUI(List<Car> cars) {
		String winnerName = cars.toString();
		System.out.println(winnerName.substring(1, winnerName.length()-1) + "가 최종 우승했습니다.");
	}
}
