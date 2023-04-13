package baseball.util;

import baseball.domain.BallStrike;

public class Output {

    public static String enterNumber() {
        return "숫자를 입력해주세요 : ";
    }

    public static String displayEndAndRematch() {
        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
        "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    }

    public static String displayBallStrike(BallStrike result) {
        int ball = result.getBall();
        int strike = result.getStrike();
        if (ball == 0 && strike == 0) {
            return "낫싱";
        }
        if (ball == 0) {
            return strike + "스트라이크";
        }
        if (strike == 0) {
            return ball + "볼";
        }
        return ball + "볼 " + strike + "스트라이크";
    }
}
