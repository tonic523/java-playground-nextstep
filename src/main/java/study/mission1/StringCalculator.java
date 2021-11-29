package study.mission1;

public class StringCalculator extends Calculator {
	private String[] buffer;

	public StringCalculator() {
		this("");
	}

	public StringCalculator(String str) {
		saveInput(str);
	}

	public String[] saveInput(String str) {
		buffer = str.split(" ");
		return buffer;
	}

	public int stringCalculate() {
		int result = Integer.valueOf(buffer[0]);
		for (int i = 1; i < buffer.length; i++) {
			int number = Integer.valueOf(buffer[i + 1]);
			result = calculate(result, number, buffer[i]);
			i++;
		}
		return result;
	}

	public int calculate(int a, int b, String type) {
		switch (type) {
			case "+":
				return add(a, b);
			case "-":
				return subtract(a, b);
			case "*":
				return multiply(a, b);
			case "/":
				return divide(a, b);
		}
		return 0;
	}
}
