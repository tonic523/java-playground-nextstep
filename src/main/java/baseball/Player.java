package baseball;

import java.util.*;
import java.util.stream.IntStream;

public class Player {
    static final int SIZE = 3;
    private int[] numbers = new int[SIZE];

    public Player(int[] numbers) {
        this.numbers = numbers;
    };

    public Player() {
        this.numbers = setRandomNumbers();
    }

    public int[] setRandomNumbers() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < SIZE) {
            int number = (int) ((Math.random() * 9) + 1);
            set.add(number);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.shuffle(list);

        for (int i = 0; i < SIZE; i++) {
            numbers[i] = list.get(i);
        }
        return numbers;
    }

    public Map<String, Integer> getHint(int[] numbers) {
        Map<String, Integer> hint = new HashMap<>();
        hint.put("strike", 0);
        hint.put("ball", 0);
        hint.put("nothing", 0);
        for (int i = 0; i < SIZE; i++) {
            int number = numbers[i];
            String type = getType(number, i);
            hint.replace(type, hint.get(type) + 1);
        }
        return hint;
    }

    public String getType(int number, int index) {
        if (IntStream.of(numbers).anyMatch(x -> x == number)) {
            return isBallStrike(number, index);
        }
        return "nothing";
    }

    public String isBallStrike(int number, int index) {
        if (number == numbers[index]) {
            return "strike";
        }
        return "ball";
    }
}
