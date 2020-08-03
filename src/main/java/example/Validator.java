package example;

import java.util.HashSet;

public class Validator {
    private final int inputGuessValidLength = 4;
    private final int minRange = 0;
    private final int maxRange = 9;

    public boolean isLegal(int[] inputGuess) {
        return isLengthValid(inputGuess) && !isRepeat(inputGuess);
    }

    public boolean isLengthValid(int[] inputGuess) {
        return inputGuess.length == inputGuessValidLength;
    }

    public boolean isRepeat(int[] inputGuess) {
        HashSet hashSet = new HashSet();
        for (int number : inputGuess) {
            hashSet.add(number);
        }
        if (hashSet.size() < inputGuess.length) {
            return true;
        }
        return false;
    }

    public boolean isInRange(int[] answer) {
        for (int number : answer) {
            if (number < minRange || number > maxRange) {
                return false;
            }
        }
        return true;
    }
}
