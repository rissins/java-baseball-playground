import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerNumber {
    Scanner SCANNER = new Scanner(System.in);
    public void playerNumber() {
        List<Character> divideNumber = new ArrayList<>();
        String playerList;
        System.out.print("숫자를 입력해 주세요 : ");
        playerList = (SCANNER.next());
        for (int i = 0; i < 3; i++) {
            divideNumber.add(playerList.charAt(i));
        }
        System.out.println(divideNumber);
    }

}
