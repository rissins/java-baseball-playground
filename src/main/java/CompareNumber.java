import java.util.List;

public class CompareNumber {
    public static int Count(List<Integer> playerNumber, List<Integer> computerNumber) {
        int totalCount = 0;
        for (int i = 0; i < computerNumber.size(); i++) {
            int player = playerNumber.get(i);
            if (computerNumber.contains(player)) {
                totalCount++;
            }
        }
        return totalCount;
    }
}
