package baseball.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    @DisplayName("3글자이면서 각 문자가 1~9 숫자면 IllegalArgumentException 발생하지 않습니다.")
    void fine() {
        assertDoesNotThrow(() -> InputValidator.validateBaseballInput("123"));
    }

    @Test
    @DisplayName("3글자가 아닌 경우 IllegalArgumentException 발생합니다.")
    void notThreeLetters() {
        assertThatThrownBy(() -> InputValidator.validateBaseballInput("1234"))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> InputValidator.validateBaseballInput("12"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("3글자이지만 각 문자가 1~9가 아닐 경우 IllegalArgumentException 발생합니다.")
    void notInOneToNine() {
        assertThatThrownBy(() -> InputValidator.validateBaseballInput("120"))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> InputValidator.validateBaseballInput("12a"))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> InputValidator.validateBaseballInput("12 "))
                .isInstanceOf(IllegalArgumentException.class);
    }
}