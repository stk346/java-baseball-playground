import org.testng.annotations.Test;

public class CalculatorTest {
    StringCalculator instance = new StringCalculator();

    @Test
    void doCalculateTest() {
        // given
        System.out.println(instance.doCalculate());
    }

}
