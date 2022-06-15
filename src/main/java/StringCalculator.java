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
}
