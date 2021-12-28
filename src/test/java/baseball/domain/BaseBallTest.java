package baseball.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BaseBallTest {
	@DisplayName("숫자야구는 3개의 숫자여야 한다.")
	@Test
	void validateSize() {
		List<Integer> successCase = new ArrayList<>(Arrays.asList(1, 2, 3));
		List<Integer> failCase = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		new Baseball(successCase);
		assertThatThrownBy(() -> new Baseball(failCase))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
