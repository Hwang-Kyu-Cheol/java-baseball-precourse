package baseball.service;

import baseball.domain.BallStrike;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class BaseballServiceTest {

    BaseballService service = new BaseballService();

    @Test
    @DisplayName("computer : [1,2,3], player : [1,2,3] 일 때 0Ball 3Strike을 반환합니다.")
    void Ball0_Strike3() {
        List<Integer> computer = Arrays.asList(1,2,3);
        List<Integer> player = Arrays.asList(1,2,3);
        BallStrike result = service.findBallStrike(computer, player);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(3);
    }

    @Test
    @DisplayName("computer : [3,2,1], player : [1,2,3] 일 때 2Ball 1Strike을 반환합니다.")
    void Ball2_Strike1() {
        List<Integer> computer = Arrays.asList(3,2,1);
        List<Integer> player = Arrays.asList(1,2,3);
        BallStrike result = service.findBallStrike(computer, player);
        assertThat(result.getBall()).isEqualTo(2);
        assertThat(result.getStrike()).isEqualTo(1);
    }

    @Test
    @DisplayName("computer : [3,1,2], player : [1,2,3] 일 때 3Ball 0Strike을 반환합니다.")
    void Ball3_Strike0() {
        List<Integer> computer = Arrays.asList(3,1,2);
        List<Integer> player = Arrays.asList(1,2,3);
        BallStrike result = service.findBallStrike(computer, player);
        assertThat(result.getBall()).isEqualTo(3);
        assertThat(result.getStrike()).isEqualTo(0);
    }

    @Test
    @DisplayName("computer : [4,5,6], player : [1,2,3] 일 때 3Ball 0Strike을 반환합니다.")
    void Ball0_Strike0() {
        List<Integer> computer = Arrays.asList(4,5,6);
        List<Integer> player = Arrays.asList(1,2,3);
        BallStrike result = service.findBallStrike(computer, player);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(0);
    }
}