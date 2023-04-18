package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {

    /**
     * 난수 생성 기능
     * @return 3자리 숫자이면서, 각 자리 숫자는 모두 다르고 1~9 범위 안의 숫자를 반환
     */
    public static int generate() {
        int result = 0;
        boolean[] used = new boolean[10];
        int count = 3;
        while (count > 0) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (used[randomNumber]) {
                continue;
            }
            used[randomNumber] = true;
            result = result * 10 + randomNumber;
            count--;
        }
        return result;
    }
}
