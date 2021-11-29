package racingCar;

// 	- [ ] 회수마다 움직일 자동차를 랜덤으로 선정한다.
// 	- [ ] 경주하는 자동차 중 가장 많이 전진한 위치 값을 구한다.
// 	- [ ] 경주하는 자동차 중 많이 전진한 위치 값을 기준으로 우승자 리스트를 구한다.

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {

	@DisplayName("경주할 자동차 참가")
	@Test
	void participateCars() {
		String input = "car1,car2,car3";
		Game game = new Game(input);
		assertThat(game.getAllCars().length).isEqualTo(3);
	}

	@DisplayName("입력한 회수가 숫자인지 검사")
	@Test
	void validateIsNumber() {
		Game game = new Game("car");
		game.setCount("1");
		assertThatThrownBy(() -> game.setCount("a"))
			.isInstanceOf(IllegalArgumentException.class);
	}

}
