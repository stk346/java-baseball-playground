import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

//   StringCalculatorTest @DisplayName("더하기 기능")
//    @ParameterizedTest
//    @CsvSource(value = {"1 2,3", "2 2,4"})
//    void plus(String input, int expected){
//        StringCalculator stringCalculator = new StringCalculator();
//
//        int result = stringCalculator.plus(number, input);
//
//        assertThat(result).isEqualTo(expected);
//    }
//
//    @DisplayName("빼기 기능")
//    @ParameterizedTest
//    @CsvSource(value = {"1 2,-1", "2 2,0"})
//    void minus(String input, int expected) {
//        StringCalculator stringcalculator = new StringCalculator();
//
//        int result = stringcalculator.minus(number, input);
//
//        assertThat(result).isEqualTo(expected);
//    }
//
//    @DisplayName("곱셈 기능")
//    @ParameterizedTest
//    @CsvSource(value = {"1 2,2", "2 2,4"})
//    void multiply(String input, int expected) {
//        StringCalculator stringcalculator = new StringCalculator();
//
//        int result = stringcalculator.multiply(number, input);
//
//        assertThat(result).isEqualTo(expected);
//    }
//
//    @DisplayName("나눗셈 기능")
//    @ParameterizedTest
//    @CsvSource(value = {"1 2,0.5", "2 2,1"})
//    void devide(String input, double expected) {
//        StringCalculator stringcalculator = new StringCalculator();
//
//        double result = stringcalculator.devide(number, input);
//
//        assertThat(result).isEqualTo(expected);
//    }

    @DisplayName("더하기")
    @Test
    void calculate() {
        StringCalculator stringcalculator = new StringCalculator();
        String input = "2 + 3";

        double result = stringcalculator.calculate(input);

        assertThat(result).isEqualTo(5);
    }

    @DisplayName("빼기")
    @Test
    void calculate2() {
        StringCalculator stringcalculator = new StringCalculator();
        String input = "2 - 3";

        double result = stringcalculator.calculate(input);

        assertThat(result).isEqualTo(-1);
    }

    @DisplayName("곱셈")
    @Test
    void calculate4() {
        StringCalculator stringcalculator = new StringCalculator();
        String input = "2 * 3";

        double result = stringcalculator.calculate(input);

        assertThat(result).isEqualTo(6);
    }

    @DisplayName("나눗셈")
    @Test
    void calculate3() {
        StringCalculator stringcalculator = new StringCalculator();
        String input = "2 / 3";

        double result = stringcalculator.calculate(input);

        assertThat(result).isEqualTo(2/3.0);
    }

    @DisplayName("사칙 연산")
    @Test
    void calculate5() {
        StringCalculator stringcalculator = new StringCalculator();
        String input = "2 / 3 + 1";

        double result = stringcalculator.calculate(input);

        assertThat(result).isEqualTo(2/3.0 + 1);
    }

    @DisplayName("사칙 연산")
    @Test
    void calculate6() {
        StringCalculator stringcalculator = new StringCalculator();
        String input = "2 + 3 * 4 / 2";

        double result = stringcalculator.calculate(input);

        assertThat(result).isEqualTo(10);
    }
}
