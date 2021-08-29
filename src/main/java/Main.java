import entity.Computer;
import entity.Player;
import view.InputView;
import view.ResultView;

public class Main {

    public static void main(String[] args) {
        int gameNumber = 1;
        Computer computer = new Computer();
        System.out.println(computer.getNumbers());
        while (gameNumber == 1) {
            ResultView.requestNumber();
            String playerNumberString = InputView.inputPlayerNumberString();
            Player player = new Player(playerNumberString);

            player.compare(computer.getNumbers());
            System.out.println(player.strikeCount(computer.getNumbers()) + "스트라이크" + player.ballCount(computer.getNumbers()) + "볼");

            if (player.isGameEnd(computer.getNumbers())) {
                System.out.println("3개의 숫자르 모두 맞히셨습니다! 게임 종료");
                computer = new Computer();
                System.out.println(computer.getNumbers());
                ResultView.repeatQuestion();
                gameNumber = InputView.inputPlayerNumberInt();
            }
        }
    }

}