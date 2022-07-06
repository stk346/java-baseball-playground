import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballTest {

//    BaseballGame baseballGame;
//    @BeforeEach
//    void setUp() {
//        baseballGame = new BaseballGame();
//    }

    @DisplayName("임의의 숫자를 받는 input함수 테스트")
    @Test
    void printRandomNumber() {
        System.out.println((int) (Math.random() * 999));
    }

    @DisplayName("스트라이크 개수를 확인하는 테스트")
    @Test
    void getStrikeCntTest() {
        BaseballGame baseballGame = new BaseballGame();

//        String computerBall = "713";
//        String userBall = "123";

//        int strikeCnt = 0;
//        for (int i=0; i<3; i++) {
//            if(baseballGame.checkSingleStrike(computerBall.charAt(i), userBall.charAt(i))) {
//                strikeCnt += 1;
//            }
//
//        }
        int strikeCnt = baseballGame.getStrikeCnt("713", "123");

        assertThat(strikeCnt).isEqualTo(1);
    }

    @DisplayName("스트라이크 여부를 판단하는 메소드 테스트 - 실패케이스")
    @Test
    void singleStrikeTest() {
        BaseballGame baseballGame = new BaseballGame();

        char computerSingleNumber = '7';
        char userSingleNumber = '1';

        boolean result = baseballGame.checkSingleStrike(computerSingleNumber, userSingleNumber);

        assertThat(result).isEqualTo(false);
    }

    @DisplayName("스트라이크 여부를 판단하는 메소드 테스트 - 성공케이스")
    @Test
    void singleStrikeTest2() {
        String computerSingleNumber = "1";
        String userSingleNumber = "1";
        boolean result = false;

        if (computerSingleNumber.equals(userSingleNumber)) {
            result = true;
        }

        assertThat(result).isEqualTo(true);
    }

    @DisplayName("볼 개수를 세는 메소드")
    @Test
    void isBall() {
        String computerinput = "713";
        String userinput = "123";
        String tempComputerInputForBallCnt = "";
        String tempUserInputForBallCnt = "";

        BaseballGame baseball = new BaseballGame();
        for (int i = 0; i < 3; i++) {
            char charcomputerinput = computerinput.charAt(i);
            char charuserinput = userinput.charAt(i);

            if (baseball.checkSingleStrike(charcomputerinput, charuserinput)) {
                continue;
            }

            tempComputerInputForBallCnt += String.valueOf(charcomputerinput);
            tempUserInputForBallCnt += String.valueOf(charuserinput);
        }

        int ballcounts = 0;
        for (int j = 0; j < tempUserInputForBallCnt.length(); j++) {
            if (tempComputerInputForBallCnt.contains(String.valueOf(tempUserInputForBallCnt.charAt(j)))) {
                ballcounts += 1;
            }
        }
        assertThat(ballcounts).isEqualTo(1);
    }

    @DisplayName("난수를 생성했을 때 세가지 자릿수의 값이 모두 다른지 확인하는 테스트")
    @Test
    void RandomNumberTest() {
        Random random = new Random(); // 랜덤 객체 생성
        int FirstRandNum = random.nextInt(1,9);
        int SecondRandNum = random.nextInt(1,9);
        int ThirdRandNum = random.nextInt(1,9);
        System.out.print(FirstRandNum + "" + SecondRandNum + "" + ThirdRandNum);

//        assertThat((FirstRandNum = SecondRandNum) & (SecondRandNum != ThirdRandNum) & (ThirdRandNum != FirstRandNum));
        assertThat(FirstRandNum != SecondRandNum).isEqualTo(true);
        assertThat(SecondRandNum != ThirdRandNum).isEqualTo(true);
        assertThat(FirstRandNum != ThirdRandNum).isEqualTo(true);

        while (true) {
            if ((FirstRandNum != SecondRandNum) & (SecondRandNum != ThirdRandNum) & (ThirdRandNum != FirstRandNum)) {
                break;
            }
        }
    }
    @DisplayName("낫싱 여부를 판단하는 메소드")
    @Test

    void isNothing() {
        String ComputerBall = "713";
        String UserBall = "456";


    }
}


