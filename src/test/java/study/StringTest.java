package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    // 딴위 테스트란 클래스의 퍼블릭메소드를 대상으로 그 함수가 제대로 만들어졌는지 예제상황을 추가하는것.
    @Test
    void replace() {
        String actual = "abc".replace("b", "/");
        assertThat(actual).isEqualTo("a/c");
    }

    @Test
    void replace_XMFFUtMFeO() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("aAdc");

    }

    @Test
    void split_test() {
        String[] actual = "1,2".split(",");
        String[] expected = new String[] {"1","2"};
        assertThat(actual).isEqualTo(expected);
    }
}
