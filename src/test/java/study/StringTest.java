package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class StringTest {
    @Test
    @DisplayName("replace()")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Nested
    @DisplayName("split()")
    class Split {
        @Test
        @DisplayName("잘 분리됬는지 확인")
        void contains() {
            String[] actual = "1,2".split(",");
            assertThat(actual).contains("1", "2");
        }

        @Test
        @DisplayName("특정한 값만 포함되있는지")
        void containsExactly() {
            String[] actual = "1".split(",");
            assertThat(actual).containsExactly("1");
        }
    }

    @Test
    @DisplayName("substring()")
    void substring() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Nested
    @DisplayName("charAt()")
    class CharAt {
        @Test
        @DisplayName("위치 값을 벗어나지 않을 때")
        void charAt() {
            char actual = "abc".charAt(1);
            assertThat(actual).isEqualTo('b');
        }

        @Test
        @DisplayName("위치 값을 벗어났을 때")
        void charAt2() {
            assertThatThrownBy(() -> {
                "abc".charAt(4);
            }).isInstanceOf(StringIndexOutOfBoundsException.class);
        }
    }
}
