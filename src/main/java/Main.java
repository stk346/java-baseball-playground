import org.testng.annotations.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            BaseballGame baseballGame = new BaseballGame();
            InputValidator inputValidator = new InputValidator();
            String computerInput = baseballGame.generateComputerInput();
            String restartGameOrEnd = "";

            while (true) {
                String userInput = inputValidator.firstInputValidator();

                int strikeCnt = baseballGame.getStrikeCnt(computerInput, userInput);
                String removedUserInput = baseballGame.removeUserInputIfStrike(computerInput, userInput);
                String removedComputerInput = baseballGame.removeComputerInputIfStrike(computerInput, userInput);
                baseballGame.getStrikeAndBallMassage(computerInput, userInput);
                baseballGame.getNothing(computerInput, userInput);

                if (strikeCnt == 3) {
                    baseballGame.getUserInputWhenThreeStrike();
                    break;
                }

            }
            String secondUserInput = inputValidator.userInputWhenThreeStrike();
            if (Integer.valueOf(secondUserInput) == 1) {
                continue;
            }
            if (Integer.valueOf(secondUserInput) == 2) {
                System.out.println("게임을 종료합니다.");
                break;
            }

        }
    }
}
