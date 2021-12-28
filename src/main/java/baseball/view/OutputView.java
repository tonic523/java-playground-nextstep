package baseball.view;

import baseball.domain.Hint;

import static baseball.domain.BallType.*;

public class OutputView {
	public static void hintUI(Hint hint) {
		String print = "";
		if (hint.nothing() == 3) {
			System.out.println("낫싱");
			return;
		}
		if (hint.ball() != 0) {
			print += hint.ball() + BALL.getName() + " ";
		}
		if (hint.strike() != 0) {
			print += hint.strike() + STRIKE.getName();
		}
		System.out.println(print);
	}
}
