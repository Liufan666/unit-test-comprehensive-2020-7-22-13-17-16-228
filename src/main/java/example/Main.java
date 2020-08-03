package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//todo
        Scanner sc = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber(new AnswerGenerator());
        Process process = new Process();
        process.playGame(guessNumber,sc);
        sc.close();
    }
}
