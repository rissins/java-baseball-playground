package view;

import java.util.Scanner;

public class InputView {

    // 입력 받는 역할
    private static Scanner SCANNER = new Scanner(System.in);

    public static String inputPlayerNumberString() {
        return SCANNER.next();
    }
    public static int inputPlayerNumberInt() {
        return SCANNER.nextInt();
    }
}
