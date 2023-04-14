package baseball.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResolverTest {

    @Test
    @DisplayName("숫자 123은 [1,2,3]인 리스트로 변환됩니다.")
    void convertInt() {
        List<Integer> list = Resolver.convertToIntegerList(123);
        Assertions.assertThat(list.equals(Arrays.asList(1,2,3))).isTrue();
    }

    @Test
    @DisplayName("문자열 '123'은 [1,2,3]인 리스트로 변환됩니다.")
    void convertString() {
        List<Integer> list = Resolver.convertToIntegerList("123");
        Assertions.assertThat(list.equals(Arrays.asList(1,2,3))).isTrue();
    }
}