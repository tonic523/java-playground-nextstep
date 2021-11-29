package racingCar;

// - [ ] 1칸씩 위치를 이동할 수 있다.
// 	- [ ] [예외] 차의 이름은 5자까지 가능
// 	- [ ] 이름, 위치를 반환

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	@DisplayName("차의 이름 길이 검사")
	@Test
	void validateSize() {
		Assertions.assertThatThrownBy(() -> new Car("abcdef"))
			.isInstanceOf(IllegalArgumentException.class);
	}

}
