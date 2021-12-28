package baseball.domain;

public enum BallType {
	STRIKE("스트라이크"),
	BALL("볼"),
	NOTHING("낫싱");

	private final String name;

	BallType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
