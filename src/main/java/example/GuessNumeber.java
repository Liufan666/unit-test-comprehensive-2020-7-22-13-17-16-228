package example;


import java.util.*;

public class GuessNumeber {
    private int[] answer;

    public GuessNumeber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        String result = "";
        result = getAcountOfA(inputGuess) + "A" + (getAcountOfB(inputGuess) - getAcountOfA(inputGuess)) + "B";
        return result;//todo
    }

    public int getAcountOfB(int[] inputGuess) {//todo
        List list = new LinkedList();//todo
        int accountOfB = 0;
        for (int index = 0; index < answer.length; index++) {
            list.add(answer[index]);//todo Arrays.asList
        }
        for (int index = 0; index < inputGuess.length; index++) {
            if (list.contains(inputGuess[index])) {
                accountOfB++;
            }
        }
        return accountOfB;

    }

    public int getAcountOfA(int[] inputGuess) {
        int accountOfA = 0;
        for (int index = 0; index < (Math.min(inputGuess.length, answer.length)); index++) {//todo
            if (inputGuess[index] == answer[index]) {
                accountOfA++;
            }
        }
        return accountOfA;
    }

    public boolean isLegal(int[] inputGuess) {

        return inputGuess.length == 4 && !isRepeat(inputGuess);
    }

    public boolean isRepeat(int[] inputGuess) {
        for (int index1 = 0; index1 < inputGuess.length - 1; index1++) {//todo hashest
            for (int index2 = index1 + 1; index2 < inputGuess.length; index2++) {
                if (inputGuess[index1] == inputGuess[index2]) {
                    return true;
                }
            }
        }
        return false;
    }

}
