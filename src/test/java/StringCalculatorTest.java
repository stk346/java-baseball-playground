import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @DisplayName("더하기 기능")
    @ParameterizedTest
    @CsvSource(value = {"1 2,3", "2 2,4"})
    void plus(String input, int expected){
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.plus(input);

        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("빼기 기능")
    @ParameterizedTest
    @CsvSource(value = {"1 2,-1", "2 2,0"})
    void minus(String input, int expected) {
        StringCalculator stringcalculator = new StringCalculator();

        int result = stringcalculator.minus(input);

        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("곱셈 기능")
    @ParameterizedTest
    @CsvSource(value = {"1 2,2", "2 2,4"})
    void multiply(String input, int expected) {
        StringCalculator stringcalculator = new StringCalculator();

        int result = stringcalculator.multiply(input);

        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("나눗셈 기능")
    @ParameterizedTest
    @CsvSource(value = {"1 2,0.5", "2 2,1"})
    void devide(String input, double expected) {
        StringCalculator stringcalculator = new StringCalculator();

        double result = stringcalculator.devide(input);

        assertThat(result).isEqualTo(expected);
    }
}
