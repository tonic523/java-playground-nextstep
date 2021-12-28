package baseball.service;

import java.util.Arrays;

import baseball.domain.BallType;
import baseball.domain.Baseball;
import baseball.domain.Hint;

import static baseball.domain.BallType.*;

public class HintService {
	public Hint createHint(Baseball baseball1, Baseball baseball2) {
		Hint hint = new Hint();
		Integer[] ballNumbers1 = baseball1.getNumbers();
		Integer[] ballNumbers2 = baseball2.getNumbers();
		for (int position = 0; position < Baseball.SIZE; position++) {
			BallType ballType = getBallType(ballNumbers1, ballNumbers2[position], position);
			hint.setHint(ballType);
		}
		return hint;
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
}
