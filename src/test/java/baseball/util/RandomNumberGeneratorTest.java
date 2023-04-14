package baseball.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    @DisplayName("생성하는 숫자는 3자리 숫자이면서, 각 자리 숫자는 모두 다르고 1~9 범위 안 입니다.")
    void test() {
        int count = 0;
        while (count < 100) {
            int randomNumber = RandomNumberGenerator.generate();
            assertThat(randomNumber).isGreaterThan(100).isLessThan(1000);
            assertThat(isValidate(randomNumber)).isTrue();
            count++;
        }
    }

    private boolean isValidate(int number) {
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