import java.util.Scanner;

public class InputValidator {

    public String firstInputValidator() {
        BaseballGame baseballgame = new BaseballGame();
        String validateUserInput;
        while (true) {
            validateUserInput = baseballgame.getUserInput();
            if (!validateUserInput.matches("[1-9]+")) {
                System.out.println("숫자만 입력해주세요.");
                continue;
            }
            if (validateUserInput.length() != 3) {
                System.out.println("세자리 숫자를 입력해주세요.");
                continue;
            }
            break;
        }
        return validateUserInput;
    }

    public String userInputWhenThreeStrike() {
        String secondUserInput = "";
        while (true) {
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            if (userInput.length() > 1) {
                System.out.println("한 자리의 숫자만 입력해주세요.");
                continue;
            }
            if ((userInput.contains("[0]+")) || (userInput.contains("[3-9]+"))) {
                System.out.println("1 또는 2만 입력해주세요");
                continue;
            }
            secondUserInput += userInput;
            break;
        }
        return secondUserInput;
    }
}
