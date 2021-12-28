package baseball.domain;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static baseball.domain.BallType.*;
import static org.assertj.core.api.Assertions.*;

public class HintTest {
	private Hint hint = new Hint();

	@BeforeEach
	void setUp() {
		hint = new Hint();
	}
	@DisplayName("스트라이크")
	@Test
	void strike() {
		hint.setHint(STRIKE);
		assertThat(hint.strike()).isEqualTo(1);
	}

	@DisplayName("볼")
	@Test
	void ball() {
		hint.setHint(BALL);
		assertThat(hint.ball()).isEqualTo(1);
	}

	@DisplayName("낫싱")
	@Test
	void nothing() {
		hint.setHint(NOTHING);
		assertThat(hint.nothing()).isEqualTo(1);
	}
}
