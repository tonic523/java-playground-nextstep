package racingCar;

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
