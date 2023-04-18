package baseball;

import baseball.controller.BaseballController;
import baseball.service.BaseballService;

public class AppConfig {
    public BaseballController baseballController() {
        return new BaseballController(baseballService());
    }

    public BaseballService baseballService() {
        return new BaseballService();
    }
}
