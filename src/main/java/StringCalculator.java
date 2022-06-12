import org.testng.annotations.Test;

import java.util.Scanner;

public class StringCalculator {

    public int calculate() {
//        String[] values = getUserInput();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] values = input.split(" ");

        int result = Integer.parseInt(values[0]);
        for(int i=1; i<values.length; i += 2) {
            String calculateSign = values[i];

            if (calculateSign.equals(new String("+"))) {
                int ele2 = Integer.parseInt(values[i+1]);
                result += ele2;
            }

            if (calculateSign.equals(new String("*"))) {
                int ele2 = Integer.parseInt(values[i+1]);
                result *= ele2;
            }

            if (calculateSign.equals(new String("-"))) {
                int ele2 = Integer.parseInt(values[i+1]);
                result -= ele2;
            }

            if (calculateSign.equals(new String("/"))) {
                int ele2 = Integer.parseInt(values[i+1]);
                result /= ele2;
            }


        }

        return result;
    }

//    private String[] getUserInput() {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        String[] values = input.split(" ");
//        return values;
//    }


}

