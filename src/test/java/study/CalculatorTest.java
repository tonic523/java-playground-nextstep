package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    private int num1;
    private int num2;

    @BeforeEach
    void setUp() {
        num1 = 10;
        num2 = 2;
    }

    @DisplayName("덧셈")
    @Test
    void add() {
        assertThat(calculator.add(num1, num2)).isEqualTo(12);
    }

    @DisplayName("뺄셈")
    @Test
    void subtract() {
        assertThat(calculator.subtract(num1, num2)).isEqualTo(8);
    }

    @DisplayName("나눗셈")
    @Test
    void divide() {
        assertThat(calculator.divide(num1, num2)).isEqualTo(5);
    }

    @DisplayName("곱셈")
    @Test
    void multiply() {
        assertThat(calculator.multiply(num1, num2)).isEqualTo(20);
    }
}
