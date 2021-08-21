import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {
    public List<Integer> createRandomNumber() {
        List<Integer> randomList = new ArrayList<Integer>();
        while (randomList.size() < 3) {
            int number = (int)((Math.random()*9)+1);
            if (!randomList.contains(number)) {
                randomList.add(number);
            }else{
                continue;
            }
        }
        return randomList;
    }
}

