package baseball.service;

import baseball.domain.Baseball;
import baseball.domain.Hint;

public class HintService {
	public Hint createHint(Baseball baseball1, Baseball baseball2) {
		return new Hint(baseball1, baseball2);
	}
}
