package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    private StringCalculator stringCalculator = new StringCalculator();

    @BeforeEach
    void setUp() {
        stringCalculator.saveInput("2 + 3 * 4 / 5");
    }

    @DisplayName("입력한 문자열 값을 문자열 배열로 저장")
    @ParameterizedTest
    @ValueSource(strings = {"2", "+", "3", "*", "4", "/", "5"})
    void saveInput(String str) {
        assertThat(Arrays.asList(stringCalculator.getBuffer()).contains(str)).isTrue();
    }
}
