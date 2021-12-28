package baseball.domain;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HintTest {
	private Hint hint;

	@BeforeEach
	void setUp() {
		Baseball baseball1 = new Baseball(Arrays.asList(1, 2, 3));
		Baseball baseball2 = new Baseball(Arrays.asList(1, 3, 4));
		hint = new Hint(baseball1, baseball2);
	}

	@DisplayName("스트라이크")
	@Test
	void strike() {
		assertThat(hint.strike()).isEqualTo(1);
	}

	@DisplayName("볼")
	@Test
	void ball() {
		assertThat(hint.ball()).isEqualTo(1);
	}

	@DisplayName("스트라이크")
	@Test
	void nothing() {
		assertThat(hint.nothing()).isEqualTo(1);
	}
}
