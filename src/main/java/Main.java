import java.util.List;

public class Main {
    public static void main(String[] args) {

        ComputerNumber computerNumber = new ComputerNumber();
        List<Integer> number = computerNumber.createRandomNumber();
        System.out.println(number);
    }
}