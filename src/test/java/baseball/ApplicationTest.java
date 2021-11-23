package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
