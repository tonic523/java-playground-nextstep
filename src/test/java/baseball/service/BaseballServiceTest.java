package baseball.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baseball.domain.Baseball;

import static org.assertj.core.api.Assertions.*;

public class BaseballServiceTest {
	private final BaseballService baseballService = new BaseballService();

	@DisplayName("임의의 수를 가진 숫자야구 생성")
	@Test
	void createRandomBaseball() {
		Baseball randomBaseball = baseballService.createRandomBaseball();
		assertThat(randomBaseball.getNumbers().length).isEqualTo(Baseball.SIZE);
	}
}
