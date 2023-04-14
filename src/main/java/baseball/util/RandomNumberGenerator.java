package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {

    /**
     * 난수 생성 기능
     * @return 3자리 숫자이면서, 각 자리 숫자는 모두 다르고 1~9 범위 안의 숫자를 반환
     */
    public static int generate() {
        while (true) {
            int randomNumber = Randoms.pickNumberInRange(100, 999);
            if (isValidate(randomNumber)) {
                return randomNumber;
            }
        }
    }

    /** 비즈니스 로직 **/
    // 조건 : 각 자리 숫자 모두 1~9이면서, 다른 숫자
    private static boolean isValidate(int number) {
        boolean[] used = new boolean[10];
        while (number != 0) {
            int remainder = number % 10;
            if (remainder == 0 || used[remainder]) {
                return false;
            }
            used[remainder] = true;
            number /= 10;
        }
        return true;
    }
}
