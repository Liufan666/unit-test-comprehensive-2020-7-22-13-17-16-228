package example;


import java.util.*;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        return String.format("%sA%sB", getAmountOfSameLocation(inputGuess), (getAmountOfSameValue(inputGuess) - getAmountOfSameLocation(inputGuess)));
    }

    public int getAmountOfSameValue(int[] inputGuess) {
        List list = new LinkedList();
        int amountOfSameValue = 0;
        for (int index = 0; index < answer.length; index++) {
            list.add(answer[index]);
        }
        for (int index = 0; index < inputGuess.length; index++) {
            if (list.contains(inputGuess[index])) {
                amountOfSameValue++;
            }
        }
        return amountOfSameValue;

    }

    public int getAmountOfSameLocation(int[] inputGuess) {
        int amountOfSameLocation = 0;
        for (int index = 0; index < (Math.min(inputGuess.length, answer.length)); index++) {
            if (inputGuess[index] == answer[index]) {
                amountOfSameLocation++;
            }
        }
        return amountOfSameLocation;
    }

}
