package racingCar;


import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {

	@DisplayName("경주할 자동차 참가")
	@Test
	void participateCars() {
		String input = "car1,car2,car3";
		Game game = new Game(input);
		assertThat(game.getAllCars().size()).isEqualTo(3);
	}

}
