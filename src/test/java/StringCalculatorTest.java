import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @DisplayName("더하기")
    @ParameterizedTest
    @CsvSource(value = {"1 2,3", "2 2,4"})
    void plus(String input, int expected){
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.plus(input);

        assertThat(result).isEqualTo(expected);
    }
}
