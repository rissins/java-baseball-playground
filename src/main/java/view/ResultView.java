package view;

import entity.Computer;
import entity.Player;

public class ResultView {

    public static void requestNumber() {

        System.out.print("숫자를 입력해 주세요 : ");
    }

    public static void repeatQuestion(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}