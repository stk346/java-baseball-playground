import java.util.*;

public class BaseballGame {
    private ArrayList<String> generateArray() {
        ArrayList<String> initArray = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        return initArray;
    }

    private ArrayList<String> shuffledArray() {
        ArrayList<String> initArray = generateArray();
        Collections.shuffle(initArray);
        return initArray;
    }

    public String generateComputerInput() {
        ArrayList<String> shuffledList = shuffledArray();
        StringBuffer computerOutput = new StringBuffer();
        computerOutput.append(shuffledList.get(0));
        computerOutput.append(shuffledList.get(1));
        computerOutput.append(shuffledList.get(2));
        String fixedComputerInput = String.valueOf(computerOutput);
        System.out.println("테스트용 정답 : " + fixedComputerInput);

        return fixedComputerInput;
    }

    public String getUserInput() {
        System.out.println("숫자를 입력해주세요. : ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println(userInput);
        return userInput;
    }

    public int getStrikeCnt(String computerInput, String userInput) {
        int strikeCnt = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (computerInput.charAt(i) == userInput.charAt(i)) {
                strikeCnt += 1;
            }
        }
        return strikeCnt;
    }

    public String removeComputerInputIfStrike(String computerInput, String userInput) {
        String removedComputerInput = "";
        for (int i = 0; i < userInput.length(); i++) {
            if (computerInput.charAt(i) == userInput.charAt(i)) {
                continue;
            }
            removedComputerInput += computerInput.charAt(i);
        }
        return removedComputerInput;
    }

    public String removeUserInputIfStrike(String computerInput, String userInput) {
        String removedUserInput = "";
        for (int i = 0; i < userInput.length(); i++) {
            if (computerInput.charAt(i) == userInput.charAt(i)) {
                continue;
            }
            removedUserInput += userInput.charAt(i);
        }
        return removedUserInput;
    }

    public int getBallCnt(String computerInput, String userInput) {
        String removedComputerInput = removeComputerInputIfStrike(computerInput, userInput);
        String removedUserInput = removeUserInputIfStrike(computerInput, userInput);

        int ballCnt = 0;
        for (int i = 0; i < removedUserInput.length(); i++) {
            if (removedComputerInput.contains(String.valueOf(removedUserInput.charAt(i)))) {
                ballCnt += 1;
            }
        }
        return ballCnt;
    }

    public void getStrikeAndBallMassage(String computerInput, String userInput) {
        int strikeCnt = getStrikeCnt(computerInput, userInput);
        int ballCnt = getBallCnt(computerInput, userInput);

        if ((strikeCnt > 0) & (ballCnt > 0)) {
            System.out.println(strikeCnt + "스트라이크 " + ballCnt + "볼" );
        }
        if ((strikeCnt > 0) & (ballCnt == 0)) {
            System.out.println(strikeCnt + "스트라이크");
        }
        if ((strikeCnt == 0) & (ballCnt > 0)) {
            System.out.println(ballCnt + "볼" );
        }

    }
    public void getNothing(String computerInput, String userInput) {
        int strikeCnt = getStrikeCnt(computerInput, userInput);
        int ballCnt = getBallCnt(computerInput, userInput);

        if ((strikeCnt == 0) & (ballCnt == 0)) {
            System.out.println("낫싱");
        }
    }
    public void getUserInputWhenThreeStrike() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
