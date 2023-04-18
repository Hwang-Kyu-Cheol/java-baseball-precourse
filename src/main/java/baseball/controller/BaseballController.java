package baseball.controller;

import baseball.domain.BallStrike;
import baseball.service.BaseballService;
import baseball.util.InputValidator;
import baseball.util.Output;
import baseball.util.RandomNumberGenerator;
import baseball.util.Resolver;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class BaseballController {

    private final BaseballService service;

    public BaseballController(BaseballService service) {
        this.service = service;
    }

    public void run() {
        while (true) {
            List<Integer> computer = Resolver.convertToIntegerList(RandomNumberGenerator.generate());
            playBaseball(computer);
            System.out.println(Output.displayEndAndRematch());
            String input = Console.readLine();
            InputValidator.validateYesOrNo(input);
            if (input.equals("2")) {
                break;
            }
        }
    }

    private void playBaseball(List<Integer> computer) {
        while (true) {
            System.out.print(Output.enterNumber());
            List<Integer> player = Resolver.convertToIntegerList(Console.readLine());
            BallStrike ballStrike = service.findBallStrike(computer, player);
            System.out.println(Output.displayBallStrike(ballStrike));
            if (ballStrike.isSuccess()) {
                break;
            }
        }
    }
}

