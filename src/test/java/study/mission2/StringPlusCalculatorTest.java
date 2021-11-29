package study.mission2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringPlusCalculatorTest {

	@DisplayName("빈 문자열 또는 null이 입력되면 0을 반환")
	@Test
	void isEmptyStringOrNull() {
		assertThat(StringPlusCalculator.isEmptyStringOrNull("")).isTrue();
		assertThat(StringPlusCalculator.isEmptyStringOrNull(null)).isTrue();
	}

	@DisplayName("입력된 문자열을 구분자, 식으로 분리")
	@Test
	void getDelimiterExpression() {
		String input = "//;\n1;2;3";
		String[] actual = StringPlusCalculator.getDelimiterExpression(input);
		assertThat(actual[0]).isEqualTo(";");
		assertThat(actual[1]).isEqualTo("1;2;3");

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

	@DisplayName("구분자와 문자열로 숫자의 총합 구하기")
	@Nested
	class Calculate {

		@DisplayName("성공")
		@ParameterizedTest
		@ValueSource(strings = {"1:2:3", "//;\n1;2;3"})
		void calculate(String testcase) {
			assertThat(StringPlusCalculator.calculate(testcase)).isEqualTo(6);
		}

		@DisplayName("실패")
		@ParameterizedTest
		@ValueSource(strings = {"-1:1:2", "/;/m1;2;3"})
		void fail(String testcase) {
			assertThatThrownBy(() -> StringPlusCalculator.calculate(testcase))
				.isInstanceOf(RuntimeException.class);
		}
	}


}