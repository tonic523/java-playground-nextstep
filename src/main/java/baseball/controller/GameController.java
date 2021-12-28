package baseball.controller;

import java.util.Arrays;

import baseball.domain.Baseball;
import baseball.service.BaseballService;
import baseball.service.HintService;
import baseball.view.InputView;

public class GameController {
	private final BaseballService baseballService = new BaseballService();
	private final HintService hintService = new HintService();

	public GameController() {
	}

	public void start() {
		Baseball computer = baseballService.createRandomBaseball();
		String request = InputView.requestBaseball();

	}
}
