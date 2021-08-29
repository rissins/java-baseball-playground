package entity;

import java.util.ArrayList;
import java.util.List;

public class Player {

    // 플레이어의 숫자에 대한 것 만 당담
    private static int GAME_END_COUNT = 3;
    private static int BALL_COUNT = 3;

    private final List<Integer> numbers = new ArrayList<>();

    public Player(String playerNumberString) {
        playerClear();
        for (int i = 0; i < BALL_COUNT; i++) {
            numbers.add(playerNumberString.charAt(i) - '0');
        }
    }

    public boolean isGameEnd(List<Integer> computerNumber) {
        return strikeCount(computerNumber) == GAME_END_COUNT;
    }

    public int compare(List<Integer> computerNumber) {
        int totalCount = 0;
        for (int i = 0; i < computerNumber.size(); i++) {
            int number = numbers.get(i);
            if (computerNumber.contains(number)) {
                totalCount++;
            }
        }
        return totalCount;
    }

    public int strikeCount(List<Integer> computerNumber) {
        int strikeCount = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == computerNumber.get(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int ballCount(List<Integer> computerNumber) {
        return compare(computerNumber) - strikeCount(computerNumber);
    }

    public void playerClear() {
        numbers.clear();
    }
}
