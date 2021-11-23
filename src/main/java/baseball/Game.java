package baseball;

import java.util.Scanner;

public class Game {
    private Player computer;
    private static Scanner scanner = new Scanner(System.in);

    public Game(Player computer) {
        this.computer = computer;
    }

    public int[] convertToNumbers(String str) {
        int[] numbers = new int[Player.SIZE];
        for (int i = 0; i < Player.SIZE; i++) {
            numbers[i] = str.charAt(i) - '0';
        }
        return numbers;
    }
}
