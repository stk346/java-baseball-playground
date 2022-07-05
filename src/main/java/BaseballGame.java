public class BaseballGame {
    public int printRandomNumber() {
        return (int)Math.random() * 999;
    }

    public boolean checkSingleStrike(char computerSingleNumber, char userSingleNumber) {
        boolean isStrike = false;
        if(computerSingleNumber == userSingleNumber) {
            isStrike = true;
        }
        return isStrike;
    }

    public int getStrikeCnt(String computerBalls, String userBalls) {
        int strikeCnt = 0;
        for (int i=0; i<3; i++) {
            if(this.checkSingleStrike(computerBalls.charAt(i), userBalls.charAt(i))) {
                strikeCnt += 1;
            }
        }
        return strikeCnt;
    }

    public String generateRandomNumberBalls() {
        return "123";
    }


}
