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
		assertThat(StringPlusCalculator.isCustomSplit("//;\n")).isEqualTo(";");
		assertThat(StringPlusCalculator.isCustomSplit("//;")).isEqualTo(",|:");
	}

	@DisplayName("문자열이 숫자가 아니면 예외 발생")
	@Test
	void validateIsNumber() {
		StringPlusCalculator.validateIsNumber("123");
		assertThatThrownBy(() -> StringPlusCalculator.validateIsNumber("a23"))
			.isInstanceOf(RuntimeException.class);
	}

	@DisplayName("문자열 리스트 중 숫자가 아닌게 있다면 예외 발생")
	@Test
	void validateIsNumbers() {
		String[] input = {
			"123",
			"45a",
			"789"
		};
		assertThatThrownBy(() -> StringPlusCalculator.validateIsNumbers(input))
			.isInstanceOf(RuntimeException.class);
	}
}