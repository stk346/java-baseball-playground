package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @Test
    void size_of_set () {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains(int valueSrc) {
        assertThat(numbers.contains(valueSrc)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"test:test:z", "tEst:test:y", "Java:java:k"}, delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected, String s3) {
        String actualValue = input.toLowerCase();
        assertThat(actualValue).isEqualTo(expected);
        System.out.println(s3);
//        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "7:false"}, delimiter = ':')
    void set_containsTestWithCsvSource(int input, boolean expected){
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }

}
