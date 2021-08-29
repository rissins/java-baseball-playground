package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Computer {

    private static int NUMBER_COUNT = 3;

    private static final List<Integer> numbers = new ArrayList<>();

    public Computer() {
        computerNumberClear();

        while (numbers.size() < NUMBER_COUNT) {
            int number = (int) ((Math.random() * 9) + 1);
            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }
    }

    public List<Integer> getNumbers() {
//        System.out.println("numbers = " + numbers);
        return Collections.unmodifiableList(numbers);
    }

    private void computerNumberClear() {
        numbers.clear();
    }
}

