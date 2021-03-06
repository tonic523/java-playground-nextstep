package racingCar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	@DisplayName("차의 이름 길이 검사")
	@Test
	void validateSize() {
		assertThatThrownBy(() -> new Car("abcdef"))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("이름, 위치 반환")
	@Test
	void getNamePosition() {
		Car car = new Car("car");
		assertThat(car.toString()).isEqualTo("car");
		assertThat(car.getPosition()).isEqualTo(0);
	}

	@DisplayName("1칸씩 위치 이동")
	@Test
	void move() {
		Car car = new Car("car");
		car.move();
		assertThat(car.getPosition()).isEqualTo(1);
	}

}
