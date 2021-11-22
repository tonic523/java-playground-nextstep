package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    private StringCalculator stringCalculator = new StringCalculator();

    @DisplayName("입력한 문자열 값을 문자열 배열로 저장")
    @Test
    void saveInput() {
        String[] actual = stringCalculator.saveInput("2 + 3 * 4 / 5");
        assertThat(actual.length).isEqualTo(7);
    }

    @DisplayName("사칙연산에 따른 계산")
    @ParameterizedTest
    @CsvSource(
            value = { "+:12", "-:8", "*:20", "/:5" },
            delimiter = ':'
    )
    void calculate(String type, int result) {
        int a = 10;
        int b = 2;
        assertThat(stringCalculator.calculate(a, b, type)).isEqualTo(result);
    }
}
