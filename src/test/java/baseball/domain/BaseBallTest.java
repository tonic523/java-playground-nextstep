package baseball.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BaseBallTest {
	@DisplayName("3개의 숫자여야 한다.")
	@Test
	void validateSize() {
		List<Integer> successCase = new ArrayList<>(Arrays.asList(1, 2, 3));
		List<Integer> failCase = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		new Baseball(successCase);
		assertThatThrownBy(() -> new Baseball(failCase))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("각 숫자의 범위는 1~9")
	@Test
	void validateNumberRange() {
		List<Integer> successCase = new ArrayList<>(Arrays.asList(1, 2, 3));
		List<Integer> failCase = new ArrayList<>(Arrays.asList(0, 1, 2));
		new Baseball(successCase);
		assertThatThrownBy(() -> new Baseball(failCase))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("중복된 값은 없어야 한다.")
	@Test
	void validateDuplication() {
		List<Integer> successCase = new ArrayList<>(Arrays.asList(1, 2, 3));
		List<Integer> failCase = new ArrayList<>(Arrays.asList(1, 1, 2));
		new Baseball(successCase);
		assertThatThrownBy(() -> new Baseball(failCase))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
