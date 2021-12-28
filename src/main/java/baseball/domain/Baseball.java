package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Baseball {
	private static final int SIZE = 3;
	private static final Predicate<Integer> NUMBER_RANGE = n -> 1 <= n && n <= 9;

	private final List<Integer> baseball = new ArrayList<>();

	public Baseball(List<Integer> numbers) {
		validateSize(numbers);
		validateNumberRange(numbers);
		validateDuplication(numbers);
		baseball.addAll(numbers);
	}

	private void validateSize(List<Integer> numbers) {
		if (numbers.size() != SIZE) {
			throw new IllegalArgumentException();
		}
	}

	private void validateNumberRange(List<Integer> numbers) {
		if (!numbers.stream()
			.allMatch(NUMBER_RANGE)) {
			throw new IllegalArgumentException();
		}
	}

	private void validateDuplication(List<Integer> numbers) {
		if (numbers.stream().distinct().count() != 3) {
			throw new IllegalArgumentException();
		}
	}
}
