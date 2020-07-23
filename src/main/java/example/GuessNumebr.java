package example;



public class GuessNumebr {
    private int[] answer;

    public GuessNumebr(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        if(isAllCorrect(inputGuess, answer)){
            return "4A0B";
        }
        return null;
    }
    public boolean isAllCorrect(int[] inputGuess,int[] answer){
        for (int index=0;index!=(inputGuess.length<answer.length?inputGuess.length:answer.length);index++)
            if (inputGuess[index]!=(answer[index])) return false;
        return true;
    }

}
