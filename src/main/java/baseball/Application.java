package baseball;

import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public int[] convertToNumbers(String str) {
        int[] numbers = new int[Player.SIZE];
        for (int i = 0; i < Player.SIZE; i++) {
            numbers[i] = str.charAt(i) - '0';
        }
        return numbers;
    }

    public boolean validateInput(String str) {
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

    public boolean validateChar(char c) {
        if ('1' <= c && c <= '9') {
            return true;
        }
        return false;
    }
}
