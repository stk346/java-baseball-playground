package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballTest {

    @DisplayName("임의의 숫자를 받는 input함수 테스트")
    @Test
    void printRandomNumber() {
        System.out.println((int)(Math.random() * 999));
    }

    @Display
}
