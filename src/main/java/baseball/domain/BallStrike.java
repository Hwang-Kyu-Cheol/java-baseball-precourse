package baseball.domain;

public class BallStrike {
    private int ball;
    private int strike;
    private boolean isSuccess;

    public BallStrike(int ball, int strike, boolean isSuccess) {
        this.ball = ball;
        this.strike = strike;
        this.isSuccess = isSuccess;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
}
