package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class Resolver {

    /**
     * 숫자 또는 문자열을 List<Integer>로 변환해주는 기능
     * @param input
     * @return List<Integer>
     */
    public static List<Integer> convertToIntegerList(int input) {
        List<Integer> list = new ArrayList<>();
        while (input != 0) {
            list.add(0, input % 10);
            input /= 10;
        }
        return list;
    }

    public static List<Integer> convertToIntegerList(String input) {
        InputValidator.validateBaseballInput(input);
        return convertToIntegerList(Integer.parseInt(input));
    }
}
