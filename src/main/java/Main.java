import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BaseballGame baseballGame = new BaseballGame();

        while(true) {
            String computerBalls = baseballGame.generateRandomNumberBalls(); // "123"
            System.out.println("숫자를 입력해 주세요 : " + computerBalls);
            String userBalls = sc.nextLine();

            while( baseballGame.getStrikeCnt(computerBalls, userBalls) != 3) {
                System.out.println("숫자를 입력해 주세요 : ");
                userBalls = sc.nextLine();
            }
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            String isGameOver = sc.nextLine();
            if(isGameOver.equals("2")) {
                break;
            }
        }




    }
}
