package baseball.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import baseball.domain.Baseball;

public class BaseballService {
	public Baseball createRandomBaseball() {
		Set<Integer> baseballSet = new LinkedHashSet<>();
		while (baseballSet.size() < Baseball.SIZE) {
			baseballSet.add((int) (Math.random() * 9 + 1));
		}
		return new Baseball(new ArrayList<>(baseballSet));
	}

	public Baseball toBaseball(String numberString) {
		List<Integer> numbers = new ArrayList<>();
		for (char c : numberString.toCharArray()) {
			numbers.add(c - '0');
		}
		return new Baseball(numbers);
	}
}
