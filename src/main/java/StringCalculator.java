public class StringCalculator {
    public double plus(double first, double second) {
        return first + second;
    }

    public double minus(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double devide(double first, double second) {
        return first / second;
    }

    public double calculate(String input) {
        String[] parsedInput = input.split(" ");

        double result = Double.parseDouble(parsedInput[0]);

        for (int i = 1; i < parsedInput.length; i++) {
            result = temp(parsedInput, result, i);
        }

        return result;
    }

    private double temp(String[] parsedInput, double result, int i) {
        String target = parsedInput[i];
        //숫자 판별

        if (Character.isDigit(target.charAt(0))) {
            int number = Integer.parseInt(target);
            String operator = parsedInput[i - 1];

            result = operate(operator, result, number);

        }
        return result;
    }

    private double operate(String operator, double result, int number) {
        if (operator.equals("+")) {
            result = plus(result, number);
        }
        if (operator.equals("-")) {
            result = minus(result, number);
        }
        if (operator.equals("*")) {
            result = multiply(result, number);
        }
        if (operator.equals("/")) {
            result = devide(result, number);
        }
        return result;
    }
}
