package baseball.controller;

import java.util.Arrays;

import baseball.domain.Baseball;
import baseball.domain.Hint;
import baseball.service.BaseballService;
import baseball.service.HintService;
import baseball.validator.InputValidator;
import baseball.view.ExceptionView;
import baseball.view.HintView;
import baseball.view.InputView;

public class GameController {
	private static final boolean PLAY = true;
	private static final int THREE_STRIKE = 3;

	private final BaseballService baseballService = new BaseballService();
	private final HintService hintService = new HintService();

	public GameController() {
	}

	public void start() {
		Baseball computer = baseballService.createRandomBaseball();
		while (PLAY) {
			Baseball user = requestBaseball();
			Hint hint = hintService.createHint(computer, user);
			if (hint.strike() == THREE_STRIKE) {
				break;
			}
			HintView.UI(hint);
		}
	}

	public Baseball requestBaseball() {
		try {
			String request = InputView.requestBaseball();
			InputValidator.isNumber(request);
			return baseballService.toBaseball(request);
		} catch (IllegalArgumentException e) {
			ExceptionView.UI(e);
			return requestBaseball();
		}
	}
}
