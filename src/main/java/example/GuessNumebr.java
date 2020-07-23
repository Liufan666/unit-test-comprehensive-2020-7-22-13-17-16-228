package example;


import java.util.*;

public class GuessNumebr {
    private int[] answer;

    public GuessNumebr(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        if(isAllCorrect(inputGuess, answer)){
            return "4A0B";
        }
        if(getAcountOfB(inputGuess)==0){
            return "0A0B";
        }
        if(getAcountOfA(inputGuess)==2 && getAcountOfB(inputGuess)==2){
            return "2A0B";
        }
        return null;
    }
    public boolean isAllCorrect(int[] inputGuess,int[] answer){
        for (int index=0;index!=(inputGuess.length<answer.length?inputGuess.length:answer.length);index++){
            if (inputGuess[index]!=(answer[index])) return false;
        }
        return true;
    }
    public int getAcountOfB(int[] inputGuess){
        List list = new LinkedList();
        int accountOfB = 0;
        for(int index=0;index<answer.length;index++){
            list.add(answer[index]);
        }
        for(int index=0;index<inputGuess.length;index++){
            if(list.contains(inputGuess[index])){
                accountOfB++;
            }
        }
        return accountOfB;

    }

    public int getAcountOfA(int[] inputGuess){
        int accountOfA = 0;
        for (int index=0;index!=(inputGuess.length<answer.length?inputGuess.length:answer.length);index++)
            if (inputGuess[index]==(answer[index])){
                accountOfA++;
            }
        return accountOfA;
    }

}
