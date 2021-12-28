package baseball.view;

public class ExceptionView {
	private static final String ERROR_MESSAGE = "[ERROR] ";

	public static void UI(Exception e) {
		System.out.println(ERROR_MESSAGE + e.getMessage());
	}
}
