package racingCar;

// - [ ] [예외] 입력한 회수가 숫자인지 검사
// 	- [ ] 입력값을 , 로 구분하여 경주할 자동차를 리스트로 가진다.
// 	- [ ] 회수에 따라 게임을 진행한다.
// 	- [ ] 게임이 끝나면 우승자가 누군지 알려준다.

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
	@DisplayName("입력한 회수가 숫자인지 검사")
	@Test
	void validateIsNumber() {
		assertThatThrownBy(() -> racingCar.Application.validateIsNumber("a"))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
