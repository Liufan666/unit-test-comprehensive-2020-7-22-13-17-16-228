package example;

import java.util.Scanner;

public class Process {
    private final int GAME_TIMES = 6;

    public void outGuessResult(int[] input, GuessNumber guessNumber) {
        Validator validator = new Validator();
        if (validator.isLegal(input)) {
            System.out.println(guessNumber.guess(input));
        } else {
            System.out.println("Wrong Input，Input again");
        }
    }

    public boolean isEnd(int[] input,GuessNumber guessNumber){
        return InputGuessNumber.isWin(input, guessNumber);
    }

    public void playGame(GuessNumber guessNumber, Scanner scanner) {
        int[] inputGuess;
        for (int time = 0; time < GAME_TIMES; time++) {
            inputGuess = InputGuessNumber.getInput(scanner);
            outGuessResult(inputGuess,guessNumber);
            if(isEnd(inputGuess,guessNumber)){
                System.out.println("you win");
                System.exit(0);
            }
        }
        System.out.println("you lose");
    }




}
