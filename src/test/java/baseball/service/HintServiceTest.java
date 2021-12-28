package baseball.service;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baseball.domain.Baseball;
import baseball.domain.Hint;

import static org.assertj.core.api.Assertions.*;

public class HintServiceTest {
	private final HintService hintService = new HintService();

	@DisplayName("2개의 숫자야구를 비교하여 힌트 객체 반환")
	@Test
	void createHint() {
		Baseball baseball1 = new Baseball(Arrays.asList(1, 2, 3));
		Baseball baseball2 = new Baseball(Arrays.asList(1, 3, 4));
		Hint hint = hintService.createHint(baseball1, baseball2);
		assertThat(hint.strike()).isEqualTo(1);
		assertThat(hint.ball()).isEqualTo(1);
		assertThat(hint.nothing()).isEqualTo(1);
	}
}
