package baseball.service;

import java.util.Arrays;

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

	@DisplayName("입력된 숫자리스트로 숫자야구 생성")
	@Test
	void createBaseball() {
		Baseball baseball = baseballService.createBaseball(Arrays.asList(1, 2, 3));
		Integer[] actual = baseball.getNumbers();
		assertThat(actual[0]).isEqualTo(1);
		assertThat(actual[1]).isEqualTo(2);
		assertThat(actual[2]).isEqualTo(3);
	}
}
