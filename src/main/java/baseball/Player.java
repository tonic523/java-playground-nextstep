package baseball;

import java.util.*;

public class Player {
    private static final int SIZE = 3;
    private List<Integer> numbers = new ArrayList<Integer>(SIZE);

    {
        Arrays.fill(numbers.toArray(), 0);
    }

    public Player(List<Integer> numbers) {
        setNumbers(numbers);
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Map<String, Integer> getHint(List<Integer> numbers) {
        Map<String, Integer> hint = new HashMap<>();
        hint.put("strike", 0);
        hint.put("ball", 0);
        hint.put("nothing", 0);
        for (int i = 0; i < SIZE; i++) {
            int number = numbers.get(i);
            String type = getType(number, i);
            hint.replace(type, hint.get(type) + 1);
        }
        return hint;
    }

    public String getType(int number, int index) {
        if (numbers.contains(number)) {
            return isBallStrike(number, index);
        }
        return "";
    }

    public String isBallStrike(int number, int index) {
        if (index == numbers.indexOf(number)) {
            return "strike";
        }
        return "ball";
    }
}
