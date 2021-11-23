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
}
