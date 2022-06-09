package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    // 딴위 테스트란 클래스의 퍼블릭메소드를 대상으로 그 함수가 제대로 만들어졌는지 예제상황을 추가하는것.

    String abc;
    @BeforeEach
    void setUp() {
        abc = "abc";
    }

    @Test
    void replace() {
        String actual = abc.replace("b", "/");
        assertThat(actual).isEqualTo("a/c");
    }

    @Test
    void replace_XMFFUtMFeO() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).contains("d");

    }

    @Test
    void split_test() {
        String[] actual = "1,2".split(",");
        String[] expected = new String[]{"1", "2"};
        assertThat(actual).containsExactly(expected);
    }

    @Test
    void substring_test() {
        String actual = "(1,2)".substring(1, 4);
        String expected = "1,2";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
        //특정 위치의 문자 가져오는 테스트
    void charAt_test1() {
        char abc = "abc".charAt(2);
        assertThat(abc).isEqualTo('c');
    }

    @Test //위치 값을 벗어날 때 StringIndexOutOfBoundsException이 발생하는 경우
    @DisplayName("charAt에서 assertThatThrownBy를 사용하여 Exception 처리")
    void charAt_StringIndexOutOfBoundsException_Test() {

        String abc = "abc";

        assertThatThrownBy(() -> {
            char c = abc.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("%d", 3);
    }


}
