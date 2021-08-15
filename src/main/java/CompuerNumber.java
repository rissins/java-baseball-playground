import java.util.ArrayList;

public class CompuerNumber {
    private int number1, number2, numeber3;
    private ArrayList<Integer> randomNumber = new ArrayList<Integer>();
    public void randomNumber(){
        for (int i = 0; i < 3; i++) {
            randomNumber.add(i ,(int)(Math.random()*9)+1);
        }
    }
}
