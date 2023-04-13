package baseball.service;

import baseball.domain.BallStrike;

import java.util.List;

public class BaseballService {

    /**
     * 핵심 기능 : 컴퓨터 수와 사용자 수를 통해 (볼, 스트라이크) 갯수를 찾는 기능
     * @param computer
     * @param player
     * @return BallStrike
     */
    public BallStrike findBallStrike(List<Integer> computer, List<Integer> player) {
        int ball = countBall(computer, player);
        int strike = countStrike(computer, player);
        return new BallStrike(ball, strike);
    }

    /** 비즈니스 로직 **/
    private int countBall(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            if (computer.contains(player.get(i)) && computer.get(i) != player.get(i)) {
                result++;
            }
        }
        return result;
    }

    private int countStrike(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            if (computer.get(i) == player.get(i)) {
                result++;
            }
        }
        return result;
    }
}
