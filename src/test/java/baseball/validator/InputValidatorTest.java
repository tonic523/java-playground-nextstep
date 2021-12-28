package baseball.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class InputValidatorTest {
	@DisplayName("입력값은 숫자여야 한다.")
	@Test
	void isNumber() {
		assertThatThrownBy(() -> InputValidator.isNumber("1a2"))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
