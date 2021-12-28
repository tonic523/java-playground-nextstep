package baseball.controller;

import java.util.Arrays;

import baseball.domain.Baseball;
import baseball.service.BaseballService;
import baseball.service.HintService;

public class GameController {
	private final BaseballService baseballService = new BaseballService();
	private final HintService hintService = new HintService();

	public GameController() {
	}

	public void start() {
		Baseball computer = baseballService.createRandomBaseball();
		System.out.println(Arrays.toString(computer.getNumbers()));
	}
}
