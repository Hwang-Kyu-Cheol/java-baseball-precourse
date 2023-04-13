package baseball.util;

import baseball.domain.BallStrike;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class OutputTest {

    @Test
    @DisplayName("3Ball 일 경우 '3볼'을 반환합니다.")
    void Ball3() {
        BallStrike result = new BallStrike(3, 0);
        assertThat(Output.displayBallStrike(result)).isEqualTo("3볼");
    }

    @Test
    @DisplayName("1Ball 2Strike일 경우 '1볼 2스트라이크'을 반환합니다.")
    void Ball1_Strike2() {
        BallStrike result = new BallStrike(1, 2);
        assertThat(Output.displayBallStrike(result)).isEqualTo("1볼 2스트라이크");
    }

    @Test
    @DisplayName("3Strike일 경우 '3스트라이크'을 반환합니다.")
    void Strike3() {
        BallStrike result = new BallStrike(0, 3);
        assertThat(Output.displayBallStrike(result)).isEqualTo("3스트라이크");
    }

    @Test
    @DisplayName("0Ball 0Strike 경우 '낫싱'을 반환합니다.")
    void Ball0_Strike0() {
        BallStrike result = new BallStrike(0, 0);
        assertThat(Output.displayBallStrike(result)).isEqualTo("낫싱");
    }
}