import java.util.Scanner;

public class StringCalculator {

    public int plus(String value) {
        String[] parsedString = value.split(" ");

        int result = 0;

        for (String number : parsedString) {
            result += Integer.parseInt(number);
        }

        return result;
    }

    public int minus(String value) {
        String[] parsedString = value.split(" ");

        String target = parsedString[0];
        String minusElement = parsedString[1];

        return Integer.parseInt(target) - Integer.parseInt(minusElement);
    }

    public int multiply(String value) {
        String[] parsedString = value.split(" ");

        String target = parsedString[0];
        String minusElement = parsedString[1];

        return Integer.parseInt(target) * Integer.parseInt(minusElement);
    }
}
