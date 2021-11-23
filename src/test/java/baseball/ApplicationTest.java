package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

public class ApplicationTest {
    private static Application application = new Application();

    @DisplayName("입력한 문자열을 숫자 배열로 변환")
    @Test
    void convertNumbers() {
        assertThat(Arrays.equals(
                application.convertToNumbers("123"),
                new int[] {1, 2, 3}
        ));
    }

    @DisplayName("문자가 1~9인지 검증")
    @Nested
    class ValidateChar {
        @DisplayName("성공")
        @Test
        void success() {
            assertThat(application.validateChar('9')).isTrue();
        }

        @DisplayName("실패")
        @Test
        void fail() {
            assertThat(application.validateChar('0')).isFalse();
        }
    }

    @DisplayName("입력값 검증")
    @Nested
    class ValidateInput {
        @DisplayName("성공")
        @ParameterizedTest
        @ValueSource(strings = {"123", "159"})
        void success(String input) {
            assertThat(application.validateInput(input)).isTrue();
        }

        @DisplayName("실패")
        @ParameterizedTest
        @ValueSource(strings = {"012", "1599", "abc"})
        void fail(String input) {
            assertThat(application.validateInput(input)).isFalse();
        }
    }

}
