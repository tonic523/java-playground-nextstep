package study.mission1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	@DisplayName("size()")
	@Test
	void size() {
		assertThat(numbers.size()).isEqualTo(3);
	}

	@DisplayName("contains()")
	@ParameterizedTest(name = "{0} 이면 {1}")
	@CsvSource(
		value = {"1:true", "2:true", "3:true", "4:false", "5:false"},
		delimiter = ':'
	)
	void contains(int input, boolean expected) {
		assertThat(numbers.contains(input)).isEqualTo(expected);
	}

}
