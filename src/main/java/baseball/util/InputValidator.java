package baseball.util;

public class InputValidator {

    /**
     * 부가 기능 : 사용자 입력(야구 숫자)이 올바른지 판단하는 기능
     * 조건 : 3자리, 각 자리는 모두 숫자 1~9
     * @param input
     * @throws IllegalArgumentException
     */
    public static void validateBaseballInput(String input) throws IllegalArgumentException {
        if (input.length() != 3) {
            throw new IllegalArgumentException();
        }
        for (char c : input.toCharArray()) {
            int a = c - '0';
            if (!(1 <= a && a <= 9)) {
                throw new IllegalArgumentException();
            }
        }
    }

    /**
     * 부가 기능 : 사용자 입력(예, 아니오)이 올바른지 판단하는 기능
     * 조건 : 1 또는 2
     * @param input
     * @throws IllegalArgumentException
     */
    public static void validateYesOrNo(String input) throws IllegalArgumentException {
        if (!(input.equals("1") || input.equals("2"))) {
            throw new IllegalArgumentException();
        }
    }
}
