package baseball;

import baseball.controller.GameController;

public class Application {
    private static boolean EXECUTE = true;
    private static final GameController gameController = new GameController();

    public static void main(String[] args) {
        while (EXECUTE) {
            gameController.setComputer();
            gameController.start();
            EXECUTE = gameController.choicePlay();
        }
    }
}
