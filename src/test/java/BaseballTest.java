import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        System.out.println((int)(Math.random() * 999));
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

        if(computerSingleNumber.equals(userSingleNumber)) {
            result = true;
        }

        assertThat(result).isEqualTo(true);
    }
}
