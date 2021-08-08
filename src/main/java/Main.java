public class Main {

    private static final int CONTINUE_NUMBER = 1;
    private static final int EXIT_NUMBER = 2;
    private static final int STRIKE_COUNT_GAME_OUT = 3;

    public static void main(String[] args) {

        int setNumberReplay = CONTINUE_NUMBER;

        while (true) {
            Baseball baseball = new Baseball();
            baseball.setNumberRandom();

            while (setNumberReplay == CONTINUE_NUMBER) {
                String input = View.requestNumberInput();

                baseball.setNumberPlayer(input);
                baseball.setNumBall();
                baseball.setNumStrike();
                if (baseball.setNumBall() > 0) {
                    View.printBallCount(baseball);
                }
                if (baseball.setNumStrike() > 0) {
                    View.printStrikeCount(baseball);
                }
                if (baseball.setNumStrike() == STRIKE_COUNT_GAME_OUT) {
                    View.printRepeatQuestion();
                    break;
                }
                View.printNewLine();
            }
            setNumberReplay = View.requestRepeatInput();
            if (setNumberReplay == EXIT_NUMBER) {
                View.printExit();
                break;
            }
        }
    }
}

