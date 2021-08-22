import java.util.List;

public class CompareNumber {
    public static int Count(List<Integer> playerNumber, List<Integer> computerNumber) {
        int count = 0;
        for (int i = 0; i < computerNumber.size(); i++) {
            int player = playerNumber.get(i);
            if (computerNumber.contains(player)) {
                count++;
            }
        }
        return count;
    }
}
