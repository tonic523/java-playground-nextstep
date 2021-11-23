package baseball;

public class Prompt {
    public static void input() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public static void inputError() {
        System.out.println("잘못된 입력이에요.");
    }

    public static void hint(int ball, int strike) {
        String print = "";
        if (ball > 0) {
            print += ball + "볼 ";
        }
        if (strike > 0) {
            print += strike + "스트라이크";
        }
        System.out.println(print);
    }

    public static void success() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
