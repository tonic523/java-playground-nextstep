package study.mission2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringPlusCalculatorTest {

	@DisplayName("빈 문자열 또는 null이 입력되면 0을 반환")
	@Test
	void isEmptyStringOrNull() {
		assertThat(StringPlusCalculator.isEmptyStringOrNull("")).isTrue();
		assertThat(StringPlusCalculator.isEmptyStringOrNull(null)).isTrue();
	}

	@DisplayName("커스텀 구분자를 입력했는지 구분")
	@Test
	void isCustomSplit() {
		assertThat(StringPlusCalculator.isCustomSplit("//;\n")).isTrue();
		assertThat(StringPlusCalculator.isCustomSplit("//;")).isFalse();
	}
}
