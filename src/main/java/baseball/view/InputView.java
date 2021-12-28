package baseball.view;

import java.util.Scanner;

public class InputView {
	private static final String REQUEST_BASEBALL_MESSAGE = "숫자를 입력해 주세요 : ";
	private static final String REQUEST_CHOICE_PLAY_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
		+ "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	private static final Scanner scanner = new Scanner(System.in);

	public static String requestBaseball() {
		System.out.print(REQUEST_BASEBALL_MESSAGE);
		return scanner.nextLine();
	}

	public static String requestChoicePlay() {
		System.out.println(REQUEST_CHOICE_PLAY_MESSAGE);
		return scanner.nextLine();
	}
}
