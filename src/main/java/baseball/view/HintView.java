package baseball.view;

import baseball.domain.Hint;

import static baseball.domain.BallType.*;

public class HintView {
	public static void UI(Hint hint) {
		String print = "";
		if (hint.ball() != 0) {
			print += hint.ball() + BALL.getName() + " ";
		}
		if (hint.strike() != 0) {
			print += hint.strike() + STRIKE.getName();
		}
		System.out.println(print);
	}
}
