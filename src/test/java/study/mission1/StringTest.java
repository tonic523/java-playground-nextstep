package study.mission1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
	@DisplayName("replace()")
	@Test
	void replace() {
		String actual = "abc".replace("b", "d");
		assertThat(actual).isEqualTo("adc");
	}

	@DisplayName("split()")
	@Nested
	class Split {
		@DisplayName("잘 분리됬는지 확인")
		@Test
		void contains() {
			String[] actual = "1,2".split(",");
			assertThat(actual).contains("1", "2");
		}

		@DisplayName("특정한 값만 포함되있는지")
		@Test
		void containsExactly() {
			String[] actual = "1".split(",");
			assertThat(actual).containsExactly("1");
		}
	}

	@DisplayName("substring()")
	@Test
	void substring() {
		String actual = "(1,2)".substring(1, 4);
		assertThat(actual).isEqualTo("1,2");
	}

	@DisplayName("charAt()")
	@Nested
	class CharAt {
		@DisplayName("위치 값을 벗어나지 않을 때")
		@Test
		void charAt() {
			char actual = "abc".charAt(1);
			assertThat(actual).isEqualTo('b');
		}

		@DisplayName("위치 값을 벗어났을 때")
		@Test
		void charAt2() {
			assertThatThrownBy(() -> {
				"abc".charAt(4);
			}).isInstanceOf(StringIndexOutOfBoundsException.class);
		}
	}
}
