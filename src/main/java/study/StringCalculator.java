package study;

public class StringCalculator extends Calculator {
    String[] buffer;
    int result = 0;

    public StringCalculator(String str) {
        saveInput(str);
    }

    public StringCalculator(String[] arr) {
        buffer = arr;
    }

    public void saveInput(String str) {
        buffer = str.split(" ");
    }

    public int result() {
        result = Integer.valueOf(buffer[0]);
        for (int i = 1; i < buffer.length; i++) {
            int number = Integer.valueOf(buffer[i+1]);
            result = calculate(result, number, buffer[i]);
            i++;
        }
        return result;
    }

    public int calculate(int a, int b, String type) {
        switch (type) {
            case "+" : return add(a, b);
            case "-" : return subtract(a, b);
            case "*" : return multiply(a, b);
            case "/" : return divide(a, b);
        }
        return 0;
    }
}
