import java.util.Scanner;


public class Baseball {
    private char one;
    private char two;
    private char three;
    public char[] stringArray;
    public char[] saveArray;

    public void ranNum() {
//        one = String.valueOf((Math.random()*9)+1);
//        two = String.valueOf((Math.random()*9)+1);
//        three = String.valueOf((Math.random()*9)+1);
        one = Character.forDigit(1, 10);
        two = Character.forDigit(2, 10);
        three = Character.forDigit(3, 10);
    }

    public void playerNum(int a) {
        saveArray = new char[3];
        String s = String.valueOf(a);
        stringArray = s.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            saveArray[i] = stringArray[i];
        }
    }

    public int setNum_Strike() {
        int strikeCount = 0;

        if (one == saveArray[0]) {
            strikeCount++;
        }
        if (two == saveArray[1]) {
            strikeCount++;
        }
        if (three == saveArray[2]) {
            strikeCount++;
        }

        return strikeCount;
    }

    public int setNum_Ball() {
        int ballCount = 0;
        if ((one == saveArray[1] || one == saveArray[2])) {
            ballCount++;
        }
        if (two == saveArray[0] || two == saveArray[2]) {
            ballCount++;
        }
        if (three == saveArray[0] || three == saveArray[1]) {
            ballCount++;
        }

        return ballCount;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        변수명 a 극혐
        Baseball baseball = new Baseball();
        baseball.ranNum();

        System.out.print("숫자를 입력해 주세요 : ");
        int input = scanner.nextInt();

        baseball.playerNum(input);
        baseball.setNum_Ball();
        baseball.setNum_Strike();
        if (baseball.setNum_Ball() > 0) {
            System.out.print(baseball.setNum_Ball() + "볼 ");
        }
        if (baseball.setNum_Strike() > 0) {
            System.out.print(baseball.setNum_Strike() + "스트라이크");
        }
        if (baseball.setNum_Strike() == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");

        }
    }
}
