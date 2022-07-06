import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public int printRandomNumber() {
        return (int) Math.random() * 999;
    }

    public boolean checkSingleStrike(char computerSingleNumber, char userSingleNumber) {
        boolean isStrike = false;
        if (computerSingleNumber == userSingleNumber) {
            isStrike = true;
        }
        return isStrike;
    }

    public int getStrikeCnt(String computerInput, String userBalls) {
        int strikeCnt = 0;
        for (int i = 0; i < computerInput.length(); i++) {
            if (this.checkSingleStrike(computerInput.charAt(i), userBalls.charAt(i))) {
                strikeCnt += 1;
            }
        }
        return strikeCnt;
    }

    public int getBallCnt(String computerInput, String userInput) {
        String tempComputerInputForBallCnt = "";
        String tempUserInputForBallCnt = "";

        for (int i = 0; i < computerInput.length(); i++) {
            char charcomputerinput = computerInput.charAt(i);
            char charuserinput = userInput.charAt(i);

            if (this.checkSingleStrike(charcomputerinput, charuserinput)) {
                continue;
            }

            tempComputerInputForBallCnt += String.valueOf(charcomputerinput);
            tempUserInputForBallCnt += String.valueOf(charuserinput);
        }
        int ballCounts = 0;
        for (int j = 0; j < tempUserInputForBallCnt.length(); j++) {
            if (tempComputerInputForBallCnt.contains(String.valueOf(tempUserInputForBallCnt.charAt(j)))) {
                ballCounts += 1;
            }
        }
        return ballCounts;
    }

    public String isNothing(String computerInput, String userInput) {
        String emptyValues = "";
        if ((this.getStrikeCnt(computerInput, userInput) == 0) & (this.getBallCnt(computerInput, userInput) == 0)) {
            emptyValues += "낫싱";
        }
        return emptyValues;
    }

    public String generateRandomNumberBalls() {
        Random random = new Random(); // 랜덤 객체 생성
        int FirstRandNum = random.nextInt(1, 9);
        int SecondRandNum = random.nextInt(1, 9);
        int ThirdRandNum = random.nextInt(1, 9);
        // 각 자릿수의 숫자가 모두 다르게 나올 때 까지 루프 돌리기
        while (true) {
            if ((FirstRandNum != SecondRandNum) & (SecondRandNum != ThirdRandNum) & (ThirdRandNum != FirstRandNum)) {
                break;
            } else {
                FirstRandNum = random.nextInt(1, 9);
                SecondRandNum = random.nextInt(1, 9);
                ThirdRandNum = random.nextInt(1, 9);
            }
        }
        String computerInput = "";
        computerInput += String.valueOf(FirstRandNum);
        computerInput += String.valueOf(SecondRandNum);
        computerInput += String.valueOf(ThirdRandNum);
        return computerInput;
    }

    public int runBaseballGame() {
        int returnNumber = 0;
        String computerInput = this.generateRandomNumberBalls();
        System.out.println("테스트 용도입니다 : " + computerInput);

        while (true) {
            // 유저 인풋 받기
            String userInput = "";
            Scanner tempValues = new Scanner(System.in);
            userInput += String.valueOf(tempValues.nextLine());

            if(userInput.length() != 3) {
                System.out.println("3자리만 입력하세요 : " + userInput);
                continue;
            }

            if(!userInput.matches("[0-9]+") ) {
                System.out.println("숫자만 입력하세요. : " + userInput);
                continue;
            }

            // 스트라이크, 볼, 낫싱 여부 판단해서 변수에 담기
            int strikeCnt = this.getStrikeCnt(computerInput, userInput);
            int ballCnt = this.getBallCnt(computerInput, userInput);
            String nothing = this.isNothing(computerInput, userInput);
            // 스트라이크, 볼, 낫싱 여부 출력
            if ((strikeCnt > 0) || (ballCnt > 0)) {
                System.out.println(ballCnt + "볼 " + strikeCnt + "스트라이크");
            }
            if ((strikeCnt == 0) & (ballCnt == 0)) {
                System.out.println("낫싱");
            }
            // 스트라이크가 3이면 게임 종료 메시지 출력
            int tempUserInput = 0;
            if (strikeCnt == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                Scanner tempInput = new Scanner(System.in);
                tempUserInput += tempInput.nextInt();

                if ((tempUserInput <= 0) || (tempUserInput > 2)) {
                    System.out.println("1과 2 둘 중 하나의 숫자를 입력해 주세요.");
                    System.out.println("1: 게임 새로 시작");
                    System.out.println("2: 게임 종료");
                }
                returnNumber += tempUserInput;
                break;
            }
        }
        return returnNumber;
    }
}
