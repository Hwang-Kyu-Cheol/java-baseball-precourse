package baseball.domain;

public class BallStrike {
    private int ball;
    private int strike;

    public BallStrike(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }
}
