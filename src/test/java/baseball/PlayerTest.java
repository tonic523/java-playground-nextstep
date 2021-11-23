package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Map;

public class PlayerTest {
    private Player player;

    @BeforeEach
    void setUp() {
        int[] arr = {1, 5, 9};
        player = new Player(arr);
    }

    @DisplayName("힌트 제공")
    @Nested
    class Hint {
        @DisplayName("볼 or 스트라이크인 경우")
        @ParameterizedTest
        @CsvSource(
                value = {"1:0:strike", "1:1:ball"},
                delimiter = ':'
        )
        void isBallStrike(int number, int index, String type) {
            assertThat(player.isBallStrike(number, index)).isEqualTo(type);
        }

        @DisplayName("낫싱일 경우")
        @Test
        void getType() {
            assertThat(player.getType(2, 1)).isEqualTo("nothing");
        }

        @DisplayName("힌트 반환")
        @ParameterizedTest
        @CsvSource(
                value = {"159:strike", "591:ball", "236:nothing"},
                delimiter = ':'
        )
        void getHint(String number, String type) {
            int[] arr = new int[3];
            for (int i = 0; i < number.length(); i++) {
                arr[i] = number.charAt(i) - '0';
            }
            Map<String, Integer> hint = player.getHint(arr);
            assertThat(hint.get(type)).isEqualTo(3);
        }
    }
}
