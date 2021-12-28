package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Baseball {
	private static final int SIZE = 3;

	private final List<Integer> baseball = new ArrayList<>();

	public Baseball(List<Integer> numbers) {
		validateSize(numbers);
	}

	private void validateSize(List<Integer> number) {
		if (number.size() != SIZE) {
			throw new IllegalArgumentException();
		}
	}
}
