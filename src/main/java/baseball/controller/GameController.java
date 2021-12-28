package baseball.controller;

import java.util.Arrays;

import baseball.domain.Baseball;
import baseball.service.BaseballService;
import baseball.service.HintService;
import baseball.validator.InputValidator;
import baseball.view.ExceptionView;
import baseball.view.InputView;

public class GameController {
	private final BaseballService baseballService = new BaseballService();
	private final HintService hintService = new HintService();

	public GameController() {
	}

	public void start() {
		Baseball computer = baseballService.createRandomBaseball();
		Baseball user = requestBaseball();
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
