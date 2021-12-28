package baseball.domain;

import java.util.HashMap;
import java.util.Map;

import static baseball.domain.BallType.*;

public class Hint {
	private final Map<BallType, Integer> hint = new HashMap<BallType, Integer>();

	public Hint() {
		hint.put(STRIKE, 0);
		hint.put(BALL, 0);
		hint.put(NOTHING, 0);
	}

	public void setHint(BallType ballType) {
		hint.replace(ballType, hint.get(ballType) + 1);
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
