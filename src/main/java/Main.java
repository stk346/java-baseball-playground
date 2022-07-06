import org.testng.annotations.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BaseballGame baseballgame = new BaseballGame();
        while(true) {
            int restartOrEndGame = baseballgame.runBaseballGame();
            if (restartOrEndGame == 2) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }
}
