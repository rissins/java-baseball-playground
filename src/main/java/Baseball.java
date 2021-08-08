public class Baseball {
    private char[] randomNumbers;
    public char[] inputNumbers;

    public void setNumberRandom() {
        randomNumbers = new char[3];
//        one = String.valueOf((Math.random()*9)+1);
//        two = String.valueOf((Math.random()*9)+1);
//        three = String.valueOf((Math.random()*9)+1);
        randomNumbers[0] = Character.forDigit(1, 10);
        randomNumbers[1] = Character.forDigit(2, 10);
        randomNumbers[2] = Character.forDigit(3, 10);
    }

    public void setNumberPlayer(String input) {
        inputNumbers = new char[3];
        inputNumbers[0] = input.charAt(0);
        inputNumbers[1] = input.charAt(1);
        inputNumbers[2] = input.charAt(2);
    }

    public int setNumStrike() {
        int strikeCount = 0;

        if (randomNumbers[0] == inputNumbers[0]) {
            strikeCount++;
        }
        if (randomNumbers[1] == inputNumbers[1]) {
            strikeCount++;
        }
        if (randomNumbers[2] == inputNumbers[2]) {
            strikeCount++;
        }

        return strikeCount;
    }

    public int setNumBall() {
        int ballCount = 0;
        if ((randomNumbers[0] == inputNumbers[1] || randomNumbers[0] == inputNumbers[2])) {
            ballCount++;
        }
        if (randomNumbers[1] == inputNumbers[0] || randomNumbers[1] == inputNumbers[2]) {
            ballCount++;
        }
        if (randomNumbers[2] == inputNumbers[0] || randomNumbers[2] == inputNumbers[1]) {
            ballCount++;
        }

        return ballCount;
    }
}
