package baseball.domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static baseball.domain.BallType.*;

public class Hint {
	private final Map<BallType, Integer> hint = new HashMap<BallType, Integer>();

	{
		hint.put(STRIKE, 0);
		hint.put(BALL, 0);
		hint.put(NOTHING, 0);
	}

	public Hint(Baseball baseball1, Baseball baseball2) {
		Integer[] ballNumbers1 = baseball1.getNumbers();
		Integer[] ballNumbers2 = baseball2.getNumbers();
		for (int position = 0; position < Baseball.SIZE; position++) {
			BallType ballType = getBallType(ballNumbers1, ballNumbers2[position], position);
			hint.replace(ballType, hint.get(ballType) + 1);
		}
	}

	private static BallType getBallType(Integer[] ballNumbers, Integer ballNumber, Integer ballPosition) {
		if (ballNumbers[ballPosition] == ballNumber) {
			return STRIKE;
		}
		if (Arrays.stream(ballNumbers).anyMatch(ballNumber::equals)) {
			return BALL;
		}
		return NOTHING;
	}

	public int strike() {
		return hint.get(STRIKE);
	}

	public int ball() {
		return hint.get(BALL);
	}

	public int nothing() {
		return hint.get(NOTHING);
	}
}
