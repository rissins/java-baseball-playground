import java.util.Scanner;

public class View {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String requestNumberInput() {
        System.out.print("숫자를 입력해 주세요 : ");
        return SCANNER.next();
    }

    public static void printBallCount(Baseball baseball) {
        System.out.print(baseball.setNumBall() + "볼 ");
    }

    public static void printStrikeCount(Baseball baseball){
        System.out.print(baseball.setNumStrike() + "스트라이크");
    }

    public static void printRepeatQuestion(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printExit(){
        System.out.println("종료");
    }

    public static int requestRepeatInput(){
        return  SCANNER.nextInt();
    }

    public static void printNewLine(){
        System.out.println();
    }

}
