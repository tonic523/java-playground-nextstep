package baseball.controller;

import baseball.domain.Baseball;
import baseball.domain.Hint;
import baseball.service.BaseballService;
import baseball.service.HintService;
import baseball.validator.InputValidator;
import baseball.view.ExceptionView;
import baseball.view.OutputView;
import baseball.view.InputView;

public class GameController {
	private static final int THREE_STRIKE = 3;
	private static final int RESTART = 1;

	private final BaseballService baseballService = new BaseballService();
	private final HintService hintService = new HintService();
	private Baseball computer;

	public GameController() {
	}

	public void setComputer() {
		computer = baseballService.createRandomBaseball();
	}

	public void start() {
		boolean play = true;
		while (play) {
			Baseball user = requestBaseball();
			Hint hint = hintService.createHint(computer, user);
			OutputView.hintUI(hint);
			play = isThreeStrike(hint);
		}
	}

	private boolean isThreeStrike(Hint hint) {
		return hint.strike() != THREE_STRIKE;
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

	public boolean choicePlay() {
		try {
			String request = InputView.requestChoicePlay();
			InputValidator.isOneOrTwo(request);
			int number = Integer.parseInt(request);
			return isRestart(number);
		} catch (IllegalArgumentException e) {
			ExceptionView.UI(e);
			return choicePlay();
		}
	}

	private boolean isRestart(int number) {
		return number == RESTART;
	}
}
