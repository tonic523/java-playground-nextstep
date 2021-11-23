package baseball;

import java.util.Map;
import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player computer = new Player();
        int play = 1;
        while (play == 1) {
            Prompt.input();
            String input = scanner.nextLine();
            // 잘못된 입력값
            if (!(validateInput(input))) {
                Prompt.inputError();
                continue;
            }

            int[] numbers = convertToNumbers(input);
            Map<String, Integer> hint = computer.getHint(numbers);
            if (hint.get("nothing") == 3) {
                System.out.println("낫싱");
                continue;
            }
            if (hint.get("strike") == 3) {
                Prompt.success();
                play = scanner.nextInt();
                scanner.nextLine();
                continue;
            }
            Prompt.hint(hint.get("ball"), hint.get("strike"));
        }

    }

    public static int[] convertToNumbers(String str) {
        int[] numbers = new int[Player.SIZE];
        for (int i = 0; i < Player.SIZE; i++) {
            numbers[i] = str.charAt(i) - '0';
        }
        return numbers;
    }

    public static boolean validateInput(String str) {
        if (str.length() != Player.SIZE) {
            return false;
        }
        for (int i = 0; i < Player.SIZE; i++) {
            if (!(validateChar(str.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateChar(char c) {
        if ('1' <= c && c <= '9') {
            return true;
        }
        return false;
    }
}
