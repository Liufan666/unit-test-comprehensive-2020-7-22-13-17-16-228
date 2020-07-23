package example;


import java.util.*;

public class GuessNumebr {
    private int[] answer;

    public GuessNumebr(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        String result = "";
        result = getAcountOfA(inputGuess)+"A"+(getAcountOfB(inputGuess)-getAcountOfA(inputGuess))+"B";
//        if(isAllCorrect(inputGuess, answer)){
//            return "4A0B";
//        }
//        if(getAcountOfB(inputGuess)==0){
//            return "0A0B";
//        }
//        if(getAcountOfA(inputGuess)==2 && getAcountOfB(inputGuess)==2){
//            return "2A0B";
//        }
//        if(getAcountOfA(inputGuess)==0 && getAcountOfB(inputGuess)==4){
//            return "0A4B";
//        }
//        if(getAcountOfA(inputGuess)==2 && getAcountOfB(inputGuess)==4){
//            return "2A2B";
//        }
//        if(getAcountOfA(inputGuess)==1 && getAcountOfB(inputGuess)==2){
//            return "1A1B";
//        }
        return result;
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

    public boolean isLegal(int[] inputGuess) {
        if(inputGuess.length==4){
            if(!isRepeat(inputGuess)){
                return true;
            }
        }
        return false;
    }
    public boolean isRepeat(int[] inputGuess){
        for(int index1=0;index1<inputGuess.length-1;index1++){
            for (int index2=index1+1;index2<inputGuess.length;index2++){
                if(inputGuess[index1]==inputGuess[index2]){
                    return true;
                }
            }
        }
        return false;
    }
}
